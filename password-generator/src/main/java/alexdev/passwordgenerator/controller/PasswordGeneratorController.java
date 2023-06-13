package alexdev.passwordgenerator.controller;

import alexdev.passwordgenerator.service.PasswordGenerator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PasswordGeneratorController {

    private final PasswordGenerator passwordGenerator;

    public PasswordGeneratorController(PasswordGenerator passwordGenerator) {
        this.passwordGenerator = passwordGenerator;
    }

    @GetMapping("generar-password")
    public ResponseEntity<PasswordResponse> generate() {
        String password = passwordGenerator.generate();
        return ResponseEntity.ok(PasswordResponse.create(password));
    }

}
