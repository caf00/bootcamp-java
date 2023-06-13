package alexdev.morsecode.controller;

public record MessageResponse(String message) {
    public static MessageResponse create(String message) {
        return new MessageResponse(message);
    }
}
