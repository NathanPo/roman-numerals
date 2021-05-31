package fr.romannumerals;

import java.util.Hashtable;

public class RomanToDigits {
    private static Hashtable<Character, Integer> values = new Hashtable<Character, Integer>();
    static {
        values.put('I', 1);
        values.put('V', 5);
        values.put('X', 10);
        values.put('L', 50);
        values.put('C', 100);
        values.put('D', 500);
        values.put('M', 1000);
    }

    public static int toDigits(String roman) {
        int result = 0;
        int i = 0;
        int len = roman.length();
        for (; i < len; i++) {
            int v1 = values.get(roman.charAt(i));
            if (i + 1 == len) {
                result += v1;
            } else {
                int v2 = values.get(roman.charAt(i + 1));
                if (v1 < v2) {
                    result += v2;
                    result -= v1;
                    i++;
                } else {
                    result += v1;
                }
            }
        }
        return result;
    }
}
