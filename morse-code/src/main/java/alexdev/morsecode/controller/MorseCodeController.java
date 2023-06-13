package alexdev.morsecode.controller;

import alexdev.morsecode.service.MorseCodeGenerator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseCodeController {

    private final MorseCodeGenerator morseCodeGenerator;

    public MorseCodeController(MorseCodeGenerator morseCodeGenerator) {
        this.morseCodeGenerator = morseCodeGenerator;
    }

    @GetMapping("/morse/{word}")
    public ResponseEntity<MessageResponse> toMorse(@PathVariable String word) {
        String morseCode = morseCodeGenerator.toMorse(word);
        return ResponseEntity.ok(MessageResponse.create(morseCode));
    }

    @GetMapping("/text/{morse}")
    public ResponseEntity<MessageResponse> toText(@PathVariable String morse) {
        String text = morseCodeGenerator.toText(morse);
        return ResponseEntity.ok(MessageResponse.create(text));
    }

}
