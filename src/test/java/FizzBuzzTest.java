import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FizzBuzzTest {

    @Test
    void should_return_one_when_input_one() {
        //Given
        int input = 1;

        //When
        var result = new FizzBuzz().of(input);

        //Then
        assertThat(result).isEqualTo(1);
    }

}
