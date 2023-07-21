package alexdev.newsletter.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NewsLetterRepository extends JpaRepository<NewsLetter, Long> {
    boolean existsByEmail(String email);
    Optional<NewsLetter> findByEmail(String email);
}
