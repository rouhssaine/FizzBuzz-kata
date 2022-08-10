import static java.lang.String.valueOf;

public class FizzBuzz {

    public String of(int input) {
        if (input == 3) return "fizz";
        if (input == 5) return "buzz";
        return valueOf(input);
    }

}
