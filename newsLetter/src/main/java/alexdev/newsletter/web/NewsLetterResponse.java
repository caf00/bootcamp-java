package alexdev.newsletter.web;

import java.io.Serializable;

public class NewsLetterResponse implements Serializable {
    private final Long id;
    private final String email;

    public NewsLetterResponse(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}
