package basicPrograms.interviewPrograms;

import org.apache.commons.lang3.StringUtils;

import javax.print.attribute.HashAttributeSet;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindWordCountInPhrase {
    public static void main(String[] args) {
        String inputPhrase = "welcome to Google and Google welcome you";
        method1(inputPhrase);
        method2(inputPhrase);
        method3UsingStreams(inputPhrase);  // Recommended Approach

    }

    private static void method3UsingStreams(String inputPhrase) {
        String[] strings = inputPhrase.split("\\s");
        Map<String, Long> collectedMap = Arrays.stream(strings)
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));
        collectedMap.forEach((name, count) -> System.out.println("name Java 8 = " + name + " | occurance = " + count));
        System.out.println();
    }

    private static void method2(String inputPhrase) {
        Map<String, Integer> wordMap = new HashMap<>();
        String[] strings = inputPhrase.split("\\s");
        for (String string : strings) {
            if (wordMap.containsKey(string)) {
                wordMap.put(string, wordMap.get(string) + 1);
            } else {
                wordMap.put(string, 1);
            }
        }

        wordMap.forEach((name, count) -> System.out.println("name  = " + name + " | occurance = " + count));
        System.out.println();
    }

    private static void method1(String inputPhrase) {
        Map<String, Integer> wordMap = new HashMap<>();
        StringUtils.normalizeSpace(inputPhrase);
        String[] strings = StringUtils.split(inputPhrase, " ");
        for (String string : strings) {
            if (wordMap.containsKey(string)) {
                wordMap.put(string, wordMap.get(string) + 1);
            } else {
                wordMap.put(string, 1);
            }
        }

        wordMap.forEach((name, count) -> System.out.println("name  = " + name + " | occurance = " + count));
        System.out.println();
    }


    /* Expected output:
            welcome - 2
            to - 1
            Google - 2
            and  - 1
            you - 1    */
}
