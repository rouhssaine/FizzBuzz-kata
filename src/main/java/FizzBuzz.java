import static java.lang.String.valueOf;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String of(int input) {
        if (input == 3) return FIZZ;
        if (input == 5) return BUZZ;
        return valueOf(input);
    }

}
