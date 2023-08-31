package task6;

public class CheckIfStringEndingMatchesSecondString {
    public static void main(String[] args) {
        System.out.println(Challenge.checkEnding("abc", "bc"));
        System.out.println(Challenge.checkEnding("abc", "d"));
        System.out.println(Challenge.checkEnding("samurai", "zi"));
        System.out.println(Challenge.checkEnding("feminine", "nine"));
        System.out.println(Challenge.checkEnding("convention", "tio"));
    }
}

class Challenge {
    public static boolean checkEnding(String str1, String str2) {
        //The method endsWith() is a convenience method that checks if a String ends with another given String
        return str1.endsWith(str2);

        // будет возвращать подстроку, начиная с индекса
//        String substr = str1.substring(str1.length() - str2.length());
//        return substr.equals(str2);
    }
}
