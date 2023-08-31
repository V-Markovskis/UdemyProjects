package UdemyReEx;

public class RegexChallenge {
    public static void main(String[] args) {
        String challenge = "11111-1111";
        String challenge1 = "11111";
        System.out.println(challenge.matches("^\\d{5}-\\d{4}$"));

        System.out.println(challenge.matches("^\\d{5}(-\\d{4})?$"));
        System.out.println(challenge1.matches("^\\d{5}(-\\d{4})?$"));
    }
}
