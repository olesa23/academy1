package by.academy1.homework3;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator{

    Pattern pattern= Pattern.compile("^\\+375\\d{9}$");

    @Override
    public Pattern getPattern() {
        return pattern;
    }
}

