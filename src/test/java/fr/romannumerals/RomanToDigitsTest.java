package fr.romannumerals;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class RomanToDigitsTest {

    static RomanToDigits rtd = new RomanToDigits();

    @Test
    void easy_test_xx() {
        String roman = "XX";
        int result = rtd.toDigits(roman);
        Assertions.assertThat(result).isEqualTo(20);
    }

    @Test
    void easy_test_II() {
        String roman = "II";
        int result = rtd.toDigits(roman);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void medium_test_IV() {
        String roman = "IV";
        int rslt = rtd.toDigits(roman);
        Assertions.assertThat(rslt).isEqualTo(4);
    }

    @Test
    void medium_test_IXX() {
        String roman = "IXX";
        int result = rtd.toDigits(roman);
        Assertions.assertThat(result).isEqualTo(19);
    }

    @Test
    void medium_test_XIII() {
        String roman = "XIII";
        int result = rtd.toDigits(roman);
        Assertions.assertThat(result).isEqualTo(13);
    }

    @Test
    void hard_test_CMLXXXVIII() {
        String roman = "CMLXXXVIII";
        int result = rtd.toDigits(roman);
        Assertions.assertThat(result).isEqualTo(988);
    }


    @Test
    void hard_test_MCLXXXVIII() {
        String roman = "CMLXXXVIII";
        int result = rtd.toDigits(roman);
        Assertions.assertThat(result).isEqualTo(1188);
    }
}
