package _19_string_regex._exercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
        private static Pattern pattern;
        private Matcher matcher;

        private static final String CLASS_NAME_REGEX = "^\\([0-9]{2}+\\)-0+[0-9]{9}$";

        public ValidatePhoneNumber() {
            pattern = Pattern.compile(CLASS_NAME_REGEX);
        }

        public boolean validate(String regex) {
            matcher = pattern.matcher(regex);
            return matcher.matches();
        }

    }
