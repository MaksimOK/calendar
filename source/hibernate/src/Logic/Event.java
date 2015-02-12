package Logic;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * Created by Marat on 09.02.2015.
 */
public class Event {
    private UUID event_id;
    private String event_theme;
    private String event_descr;
    private UUID linked_user_id;

    private Set events = new HashSet();

    public Event() {

    }

    public UUID getEvent_id() {
        return event_id;
    }

    public void setEvent_id(UUID event_id) {
        this.event_id = event_id;
    }

    public String getEvent_theme() {
        return event_theme;
    }

    public void setEvent_theme(String event_theme) {
        this.event_theme = event_theme;
    }

    public String getEvent_descr() {
        return event_descr;
    }

    public void setEvent_descr(String event_descr) {
        this.event_descr = event_descr;
    }

    public UUID getLinked_user_id() {
        return linked_user_id;
    }

    public void setLinked_user_id(UUID linked_user_id) {
        this.linked_user_id = linked_user_id;
    }
}
