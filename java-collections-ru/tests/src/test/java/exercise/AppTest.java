package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

        // Основная функциональность
        List<Integer> result = App.take(numbers, 2);
        List<Integer> expected = new ArrayList<>(Arrays.asList(1, 2));
        Assertions.assertEquals(expected, result);

        List<Integer> result2 = App.take(numbers, 4);
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Assertions.assertEquals(expected2, result2);

        // Пограничные случаи
        List<Integer> result3 = App.take(numbers, 0);
        List<Integer> expected3 = new ArrayList<>(Arrays.asList());
        Assertions.assertEquals(expected3, result3);

        List<Integer> result4 = App.take(numbers, 10);
        List<Integer> expected4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        Assertions.assertEquals(expected4, result4);
        // END
    }
}
