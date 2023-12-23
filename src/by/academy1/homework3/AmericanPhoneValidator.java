package by.academy1.homework3;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator{
    Pattern pattern= Pattern.compile("^\\+1\\d{10}$");

    @Override
    public Pattern getPattern() {
        return pattern;
    }
}
