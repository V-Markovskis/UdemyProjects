package task13Medium;

import static task13Medium.Stuttering.stutter;

public class StutteringFunction {
    public static void main(String[] args) {
        System.out.println(stutter("incredible"));
    }
}

class Stuttering {
    public static String stutter(String word) {
        return word.substring(0,2) + "... " + word.substring(0,2) + "... " + word + "?";
    }
}