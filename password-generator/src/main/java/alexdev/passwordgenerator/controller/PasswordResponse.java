package alexdev.passwordgenerator.controller;

public record PasswordResponse(String password) {
    public static PasswordResponse create(String password) {
        return new PasswordResponse(password);
    }
}
