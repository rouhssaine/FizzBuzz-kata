import com.google.common.base.Strings;

import java.util.Optional;

import static java.lang.String.valueOf;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final int FIZZ_VALUE = 3;
    public static final int BUZZ_VALUE = 5;

    public String of(int value) {
        StringBuilder fizzBuzzBuilder = new StringBuilder();
        if (isMultipleOf(value, FIZZ_VALUE)) fizzBuzzBuilder.append(FIZZ);
        if (isMultipleOf(value, BUZZ_VALUE)) fizzBuzzBuilder.append(BUZZ);
        return fizzBuzzOf(value, fizzBuzzBuilder);
    }

    private boolean isMultipleOf(int number, int divider) {
        return number % divider == 0;
    }

    private String fizzBuzzOf(int value, StringBuilder fizzBuzzBuilder) {
        return Optional.of(fizzBuzzBuilder)
                .map(StringBuilder::toString)
                .map(Strings::emptyToNull)
                .orElse(valueOf(value));
    }

}
