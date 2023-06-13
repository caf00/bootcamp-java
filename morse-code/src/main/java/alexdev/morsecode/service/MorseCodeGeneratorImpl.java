package alexdev.morsecode.service;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class MorseCodeGeneratorImpl implements MorseCodeGenerator{

    private Map<Character, String> morseMap;

    public MorseCodeGeneratorImpl() {
        init();
    }

    @Override
    public String toMorse(String word) {
        StringBuilder morse = new StringBuilder();

        for (char c : word.toUpperCase().toCharArray()) {
            String morseCode = morseMap.get(c);
            if (morseCode != null) {
                morse.append(morseCode).append(" ");
            } else {
                morse.append(" ");
            }
        }

        return morse.toString().trim();
    }

    @Override
    public String toText(String morse) {
        StringBuilder text = new StringBuilder();

        String[] morseWords = morse.split("\\s{3}");
        for (String morseWord : morseWords) {
            String[] morseLetters = morseWord.split("\\s");
            for (String morseLetter : morseLetters) {
                if (morseLetter.equals("")) {
                    text.append(" ");
                } else {
                    morseLetter = morseLetter.replace("%20", " ");
                    for (Map.Entry<Character, String> entry : morseMap.entrySet()) {
                        if (entry.getValue().equals(morseLetter)) {
                            text.append(entry.getKey());
                            break;
                        }
                    }
                }
            }
        }

        return text.toString();
    }

    private void init() {
        morseMap = new HashMap<>();
        morseMap.put('A', ".-");
        morseMap.put('Á', ".--.-");
        morseMap.put('B', "-...");
        morseMap.put('C', "-.-.");
        morseMap.put('D', "-..");
        morseMap.put('E', ".");
        morseMap.put('É', "..-..");
        morseMap.put('F', "..-.");
        morseMap.put('G', "--.");
        morseMap.put('H', "....");
        morseMap.put('I', "..");
        morseMap.put('Í', "..");
        morseMap.put('J', ".---");
        morseMap.put('K', "-.-");
        morseMap.put('L', ".-..");
        morseMap.put('M', "--");
        morseMap.put('N', "-.");
        morseMap.put('O', "---");
        morseMap.put('Ó', "---.");
        morseMap.put('P', ".--.");
        morseMap.put('Q', "--.-");
        morseMap.put('R', ".-.");
        morseMap.put('S', "...");
        morseMap.put('T', "-");
        morseMap.put('U', "..-");
        morseMap.put('Ú', "..-");
        morseMap.put('V', "...-");
        morseMap.put('W', ".--");
        morseMap.put('X', "-..-");
        morseMap.put('Y', "-.--");
        morseMap.put('Z', "--..");
        morseMap.put('0', "-----");
        morseMap.put('1', ".----");
        morseMap.put('2', "..---");
        morseMap.put('3', "...--");
        morseMap.put('4', "....-");
        morseMap.put('5', ".....");
        morseMap.put('6', "-....");
        morseMap.put('7', "--...");
        morseMap.put('8', "---..");
        morseMap.put('9', "----.");
    }
}
