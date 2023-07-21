package alexdev.newsletter.service;

import alexdev.newsletter.domain.NewsLetter;
import alexdev.newsletter.domain.NewsLetterRepository;
import alexdev.newsletter.exception.EmailAlreadyExistsException;
import alexdev.newsletter.domain.usecase.RegisterNewsLetterUseCase;
import alexdev.newsletter.exception.InvalidEmailException;
import alexdev.newsletter.validator.EmailValidator;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegisterNewsLetterService implements RegisterNewsLetterUseCase {

    private final NewsLetterRepository newsLetterRepository;
    protected RegisterNewsLetterService(
            NewsLetterRepository newsLetterRepository) {
        this.newsLetterRepository = newsLetterRepository;
    }

    @Override
    public void register(String email) {

        if(!EmailValidator.validator().validate(email)) {
            throw new InvalidEmailException("Invalid email format :" + email);
        }

        if(newsLetterRepository.existsByEmail(email)) {
            throw new EmailAlreadyExistsException("Email " + email + " already exists");
        }

        NewsLetter newsLetter = new NewsLetter(email);

        newsLetterRepository.save(newsLetter);

    }
}
