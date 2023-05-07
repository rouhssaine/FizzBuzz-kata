import com.google.common.base.Strings;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;

import static java.lang.String.valueOf;
import static java.util.Map.Entry.comparingByKey;
import static java.util.stream.Collectors.joining;

public class FizzBuzz {

    private static final Map<Integer, String> VALUE_BY_DIVIDER = Map.of
            (3, "Fizz",
             5, "Buzz");

    public String of(int number) {
        return convert(number)
                .orElse(valueOf(number));
    }

    private static Optional<String> convert(int value) {
        return Optional.of(VALUE_BY_DIVIDER)
                .map(Map::entrySet)
                .map(Set::stream)
                .map(stream -> stream
                        .sorted(comparingByKey())
                        .filter(entry -> isMultipleOf(value, entry.getKey()))
                        .map(Entry::getValue)
                        .collect(joining()))
                .map(Strings::emptyToNull);
    }

    private static boolean isMultipleOf(int number, int divider) {
        return number % divider == 0;
    }

}
