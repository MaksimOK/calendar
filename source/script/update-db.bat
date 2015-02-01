@echo off
cls

REM Script for database update

setlocal EnableDelayedExpansion

for /f "tokens=1* delims==" %%A in (project.properties) do (
        rem echo.%%A
	rem echo.%%B

	if "%%A"=="database.driver" set DATABASE_DRIVER=%%B
	if "%%A"=="database.url" set DATABASE_URL=%%B
	if "%%A"=="database.username" set DATABASE_USERNAME=%%B
	if "%%A"=="database.password" set DATABASE_PASSWORD=%%B
)



echo DATABASE_DRIVER  : %DATABASE_DRIVER%
echo DATABASE_URL     : %DATABASE_URL%
echo DATABASE_USERNAME: %DATABASE_USERNAME%
echo DATABASE_PASSWORD: %DATABASE_PASSWORD%


rem set DATABASE_DRIVER=
rem set DATABASE_URL
rem set DATABASE_USERNAME
rem set DatabaseUsername=

set BASE=%~dp0%

set OPTS=%OPTS% -Ddatabase.driver=%DATABASE_DRIVER%
set OPTS=%OPTS% -Ddatabase.url=%DATABASE_URL%
set OPTS=%OPTS% -Ddatabase.username=%DATABASE_USERNAME%
set OPTS=%OPTS% -Ddatabase.password=%DATABASE_PASSWORD%



mvn --file ../database/pom.xml -e clean package -Pdatabase-changelog %OPTS%
