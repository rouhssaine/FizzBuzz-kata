import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator.ReplaceUnderscores;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(ReplaceUnderscores.class)
class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    void should_return_one_when_input_one() {
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
    }

    @Test
    void should_return_two_when_input_two() {
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }

    @Test
    void should_return_fizz_when_input_three() {
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
    }

    @Test
    void should_return_buzz_when_input_five() {
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
    }

    @Test
    void should_return_fizz_when_input_six() {
        assertThat(fizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    void should_return_buzz_when_input_ten() {
        assertThat(fizzBuzz.of(10)).isEqualTo("Buzz");
    }

    @Test
    void should_return_fizzbuzz_when_input_fifteen() {
        assertThat(fizzBuzz.of(15)).isEqualTo("FizzBuzz");
    }

}
