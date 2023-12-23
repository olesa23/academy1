package by.academy1.homework3;

import java.util.regex.Pattern;

public class DateValidator implements Validator {
    Pattern pattern = Pattern.compile("\\d{2}/\\d{2}/\\d{4}");
    @Override
    public Pattern getPattern() {
        return pattern;
    }
}

