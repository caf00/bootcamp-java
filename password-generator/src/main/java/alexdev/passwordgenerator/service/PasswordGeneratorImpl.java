package alexdev.passwordgenerator.service;

import org.springframework.stereotype.Service;

@Service
public class PasswordGeneratorImpl implements PasswordGenerator{

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+[{]}\\|;:'\",<.>/?";
    private static final int PASSWORD_LENGTH = 12;

    @Override
    public String generate() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < PASSWORD_LENGTH; i++) {
            int index = (int) (Math.random() * CHARACTERS.length());
            char character = CHARACTERS.charAt(index);
            sb.append(character);
        }

        return sb.toString();
    }
}
