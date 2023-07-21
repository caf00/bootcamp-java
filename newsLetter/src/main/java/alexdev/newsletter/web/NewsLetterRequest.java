package alexdev.newsletter.web;

import java.io.Serializable;

public class NewsLetterRequest implements Serializable {
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
