package alexdev.newsletter.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern pattern = Pattern.compile(EMAIL_REGEX);

    public static EmailValidator validator() {
        return new EmailValidator();
    }

    public boolean validate(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
