package task19Hard;

import java.util.Arrays;
import java.util.stream.Collectors;

import static task19Hard.Challenge.sortByLength;

public class SortByLength {
    public static void main(String[] args) {
        System.out.println(sortByLength("Hello my friend"));
    }
}

class Challenge {
    //This code essentially performs a two-step sorting process:
    //first sorting alphabetically (ignoring case), and then sorting by word length.
    //The end result is a string where words are ordered by their lengths, and in case of equal lengths, they are ordered alphabetically.
    public static String sortByLength(String str) {
        return Arrays.stream(str.split("\\s"))
                .sorted((s1, s2) -> s1.compareToIgnoreCase(s2))
                .sorted((s1, s2) -> s1.length() - s2.length())
                .collect(Collectors.joining(" "));
    }
}
