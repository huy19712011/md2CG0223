package org.example.loops;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Part3String {
    public static void main(String[] args) {
        System.out.println("ok");

        String s = "C02 Codegym";
        char c = 'c';
        System.out.println(calculateCount(s, c));

        var newS = Arrays.asList(s.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
        System.out.println(newS);

        var otherS = s.chars()
                .mapToObj(character -> Character.valueOf((char) character))
                .distinct()
                .map(Object::toString)
                .collect(Collectors.joining(""));
        System.out.println(otherS);

        System.out.println(filterString("a ab abc abcd abcde abcdef"));

    }

    private static int calculateCount(String str, char c) {

        int count = 0;
        String newStr = str.toLowerCase();
        for (int i = 0; i < newStr.length(); ++i) {
            if (newStr.charAt(i) == c)
                count++;
        }

        return count;
    }

    private static int calculateCount2(String str, char c) {

        return str.toLowerCase().split(String.valueOf(c).toLowerCase()).length - 1;
    }

    private static int calculateCount3(String str, char character) {

        return (int) str.toLowerCase().chars().filter(ch -> ch == character).count();
    }

    public static String filterString(String s) {
        Map<Character, Integer> count = new HashMap<>();
        return s.chars()
                .mapToObj(c -> (char) c)
//                .filter(c -> String.valueOf(c) != String.valueOf(""))
//                .peek(character -> System.out.println(character))
                .filter(c -> count.merge(c, 1, Integer::sum) <= 2)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
