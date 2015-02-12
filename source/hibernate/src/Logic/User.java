package Logic;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Marat on 09.02.2015.
 */

public class User {
    private UUID user_id;
    private String user_name;
    private String user_password;

    private Set users = new HashSet();

    public User() {

    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public UUID getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public String getUser_password() {
        return user_password;
    }
}
