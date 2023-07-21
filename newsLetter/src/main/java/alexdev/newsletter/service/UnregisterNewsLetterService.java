package alexdev.newsletter.service;

import alexdev.newsletter.domain.NewsLetter;
import alexdev.newsletter.domain.NewsLetterRepository;
import alexdev.newsletter.exception.EmailNotFoundException;
import alexdev.newsletter.domain.usecase.UnregisterNewsLetterUseCase;
import alexdev.newsletter.exception.InvalidEmailException;
import alexdev.newsletter.validator.EmailValidator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UnregisterNewsLetterService implements UnregisterNewsLetterUseCase {

    private final NewsLetterRepository newsLetterRepository;

    protected UnregisterNewsLetterService(
            NewsLetterRepository newsLetterRepository) {
        this.newsLetterRepository = newsLetterRepository;
    }

    @Override
    public void unregister(String email) {

        if(!EmailValidator.validator().validate(email)) {
            throw new InvalidEmailException("Invalid email format :" + email);
        }

        NewsLetter newsLetter = newsLetterRepository
                .findByEmail(email)
                .orElseThrow(() -> new EmailNotFoundException("Email " + email + " not found"));


        newsLetterRepository.delete(newsLetter);

    }
}
