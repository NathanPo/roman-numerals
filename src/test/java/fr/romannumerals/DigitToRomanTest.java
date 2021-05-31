package fr.romannumerals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DigitToRomanTest {
    static DigitToRoman dtr = new DigitToRoman();

    @Test
    void easy_test_20() {
        int digit = 20;
        String result = dtr.toRoman(digit);
        Assertions.assertThat(result).isEqualTo("XX");
    }

    @Test
    void easy_test_2() {
        int digit = 2;
        String result = dtr.toRoman(digit);
        Assertions.assertThat(result).isEqualTo("II");
    }

    @Test
    void medium_test_4() {
        int digit = 4;
        String result = dtr.toRoman(digit);
        Assertions.assertThat(result).isEqualTo("IV");
    }

    @Test
    void medium_test_19() {
        int digit = 19;
        String result = dtr.toRoman(digit);
        Assertions.assertThat(result).isEqualTo("XIX");
    }

    @Test
    void medium_test_13() {
        int digit = 13;
        String result = dtr.toRoman(digit);
        Assertions.assertThat(result).isEqualTo("XIII");
    }

    @Test
    void hard_test_988() {
        int digit = 988;
        String result = dtr.toRoman(digit);
        Assertions.assertThat(result).isEqualTo("CMLXXXVIII");
    }

    @Test
    void hard_test_1188() {
        int digit = 1188;
        String result = dtr.toRoman(digit);
        Assertions.assertThat(result).isEqualTo("MCLXXXVIII");
    }
}
