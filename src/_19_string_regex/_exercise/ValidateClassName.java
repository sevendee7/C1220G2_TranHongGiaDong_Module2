package _19_string_regex._exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_NAME_REGEX = "^[CAP][0-9]{4}[G-M]$";

    public ValidateClassName() {
        pattern = Pattern.compile(CLASS_NAME_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
