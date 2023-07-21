package alexdev.newsletter.service;

import alexdev.newsletter.domain.NewsLetter;
import alexdev.newsletter.domain.NewsLetterRepository;
import alexdev.newsletter.domain.usecase.ListNewsLetterUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListNewsLetterService implements ListNewsLetterUseCase {

    private final NewsLetterRepository newsLetterRepository;

    protected ListNewsLetterService(NewsLetterRepository newsLetterRepository) {
        this.newsLetterRepository = newsLetterRepository;
    }

    @Override
    public List<NewsLetter> list() {
        return newsLetterRepository.findAll();
    }
}
