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
        assertThat(fizzBuzz.of(3)).isEqualTo("fizz");
    }

}
