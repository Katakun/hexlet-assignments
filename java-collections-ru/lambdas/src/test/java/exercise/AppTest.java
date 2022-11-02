package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

// BEGIN
class AppTest {
    @Test
    void testEnlargeArrayImage1x1() {
        String[][] image = {
                {"*"}
        };

        String[][] expected = {
                {"*", "*"},
                {"*", "*"}
        };

        String[][] actual = App.enlargeArrayImage(image);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testEnlargeArrayImage2x2() {
        String[][] image = {
                {"*", "*"},
                {"*", "*"}
        };

        String[][] expected = {
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"},
                {"*", "*", "*", "*"}
        };

        String[][] actual = App.enlargeArrayImage(image);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testEnlargeArrayImage3x3() {
        String[][] image = {
                {"*", "*", "*"},
                {"*", " ", "*"},
                {"*", "*", "*"}
        };

        String[][] expected = {
                {"*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*"},
                {"*", "*", " ", " ", "*", "*"},
                {"*", "*", " ", " ", "*", "*"},
                {"*", "*", "*", "*", "*", "*"},
                {"*", "*", "*", "*", "*", "*"},
        };

        String[][] actual = App.enlargeArrayImage(image);
        assertThat(actual).isEqualTo(expected);
    }
}
// END
