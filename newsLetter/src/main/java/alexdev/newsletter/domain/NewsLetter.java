package alexdev.newsletter.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "news_letter")
public class NewsLetter implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String email;

    public NewsLetter() {
    }

    public NewsLetter(Long id, String email) {
        this.id = id;
        this.email = email;
    }

    public NewsLetter(String email) {
        this(null, email);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
