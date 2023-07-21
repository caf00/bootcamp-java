package alexdev.newsletter.web;

import alexdev.newsletter.domain.usecase.ListNewsLetterUseCase;
import alexdev.newsletter.domain.usecase.RegisterNewsLetterUseCase;
import alexdev.newsletter.domain.usecase.UnregisterNewsLetterUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/newsletter")
public class NewsLetterController {

    private final ListNewsLetterUseCase listNewsLetterUseCase;
    private final RegisterNewsLetterUseCase registerNewsLetterUseCase;
    private final UnregisterNewsLetterUseCase unregisterNewsLetterUseCase;

    public NewsLetterController(
            ListNewsLetterUseCase listNewsLetterUseCase,
            RegisterNewsLetterUseCase registerNewsLetterUseCase,
            UnregisterNewsLetterUseCase unregisterNewsLetterUseCase) {
        this.listNewsLetterUseCase = listNewsLetterUseCase;
        this.registerNewsLetterUseCase = registerNewsLetterUseCase;
        this.unregisterNewsLetterUseCase = unregisterNewsLetterUseCase;
    }


    @GetMapping
    public ResponseEntity<List<NewsLetterResponse>> list() {
        return ResponseEntity.ok(
                listNewsLetterUseCase
                        .list()
                        .stream()
                        .map(n -> new NewsLetterResponse(n.getId(), n.getEmail()))
                        .toList()
        );
    }

    @PostMapping
    public ResponseEntity<MessageResponse> register(@RequestBody NewsLetterRequest newsLetterRequest) {
        registerNewsLetterUseCase.register(newsLetterRequest.getEmail());
        return ResponseEntity.ok(new MessageResponse("NewsLetter registered successfully"));
    }

    @DeleteMapping
    public ResponseEntity<MessageResponse> unregister(@RequestBody NewsLetterRequest newsLetterRequest) {
        unregisterNewsLetterUseCase.unregister(newsLetterRequest.getEmail());
        return ResponseEntity.ok(new MessageResponse("NewsLetter unregistered successfully"));
    }


}
