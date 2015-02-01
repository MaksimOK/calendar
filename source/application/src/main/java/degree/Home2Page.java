package degree;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.form.DropDownChoice;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.model.Model;

import java.util.Arrays;
import java.util.List;

/**
 * Created by max on 24.01.15.
 */
public class Home2Page extends WebPage {

    private static final String ZIPCODE = "ZIPCODE";
    private static final String PHONE = "PHONE";

    private static final List<String> TYPES = Arrays.asList(new String[]{ZIPCODE, PHONE});

    public Home2Page() {

        add(new FeedbackPanel("feedback"));

        final DropDownChoice type = new DropDownChoice("type", new Model(ZIPCODE), TYPES);
        type.setRequired(true);

        final TextField keywords = new TextField("keywords", new Model());
        keywords.setRequired(true);

        Form form = new Form("form") {
            @Override
            protected void onSubmit() {
                info("Form successfully submitted");
            }
        };
        add(form);
        form.add(type);
        form.add(keywords);

    }
}
