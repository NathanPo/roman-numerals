package fr.romannumerals;

import java.util.Hashtable;

public class DigitToRoman {
    public static String toRoman(int digit) {
        int digits[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String roman[] = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        int i = 0;
        /* Les romains n'utilisaient pas le zéro, ils ne le considéraient
           pas comme un chiffre mais comme un état de vide et donc ne l'écrivaient pas. */
        do {
            while ((digit - digits[i]) >= 0) {
                result.append(roman[i]);
                digit = digit - digits[i];
            }
            i++;
        } while (digit > 0);
        return result.toString();
    }
}
