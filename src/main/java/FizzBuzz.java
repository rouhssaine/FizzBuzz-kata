import static java.lang.String.valueOf;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String of(int input) {
        if (isFizz(input)) return FIZZ;
        if (isBuzz(input)) return BUZZ;
        return valueOf(input);
    }

    private boolean isFizz(int input) {
        return input % 3 == 0;
    }

    private boolean isBuzz(int input) {
        return input % 5 == 0;
    }

}
