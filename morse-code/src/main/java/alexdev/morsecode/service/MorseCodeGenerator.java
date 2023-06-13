package alexdev.morsecode.service;

public interface MorseCodeGenerator {
    public String toMorse(String text);
    public String toText(String morse);
}
