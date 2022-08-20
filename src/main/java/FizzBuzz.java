import static java.lang.String.valueOf;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final int FIZZ_VALUE = 3;
    public static final int BUZZ_VALUE = 5;

    public String of(int value) {
        if (isMultipleOf(value, FIZZ_VALUE) && isMultipleOf(value, BUZZ_VALUE)) return FIZZ+BUZZ;
        if (isMultipleOf(value, FIZZ_VALUE)) return FIZZ;
        if (isMultipleOf(value, BUZZ_VALUE)) return BUZZ;
        return valueOf(value);
    }

    private boolean isMultipleOf(int number, int divider) {
        return number % divider == 0;
    }

}
