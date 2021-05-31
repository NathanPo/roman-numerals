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
        String roman = "MCLXXXVIII";
        int result = rtd.toDigits(roman);
        Assertions.assertThat(result).isEqualTo(1188);
    }

    @Test
    void random_test() {
        Assertions.assertThat(rtd.toDigits("MMMMCMXCIX")).isEqualTo(4999);
        Assertions.assertThat(rtd.toDigits("CMXCIX")).isEqualTo(999);
        Assertions.assertThat(rtd.toDigits("CMLXXXIX")).isEqualTo(989);
        Assertions.assertThat(rtd.toDigits("DCXXVI")).isEqualTo(626);
        Assertions.assertThat(rtd.toDigits("DCXXIV")).isEqualTo(624);
        Assertions.assertThat(rtd.toDigits("CDXCVIII")).isEqualTo(498);
        Assertions.assertThat(rtd.toDigits("CXXIII")).isEqualTo(123);
        Assertions.assertThat(rtd.toDigits("XCIX")).isEqualTo(99);
        Assertions.assertThat(rtd.toDigits("LI")).isEqualTo(51);
        Assertions.assertThat(rtd.toDigits("XLIX")).isEqualTo(49);
        Assertions.assertThat(rtd.toDigits("I")).isEqualTo(1);
    }
}
