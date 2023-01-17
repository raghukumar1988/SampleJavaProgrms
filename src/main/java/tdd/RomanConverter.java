package tdd;

import net.bytebuddy.pool.TypePool;

public class RomanConverter {

    public int convertRomanToArabicNumber(String i) {
        int sum = 0;
        for (char ch : i.toCharArray()) {
            if (ch == 'I') {
                sum += 1;
            } else {
                throw new IllegalArgumentException(String.format("Illegal roman character %s", ch));
            }
        }
return sum;
    }
}
