package by.academy.homework.homework2.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {
    private Pattern p = Pattern.compile("^\\+1([2-9]\\d{2})(([2-9][02-9]\\d])|([2-9]\\d[02-9]))\\d{4}$");

    @Override
    public boolean validate(String vString) {
        Matcher m = p.matcher(vString);
        return m.find();
    }
}
