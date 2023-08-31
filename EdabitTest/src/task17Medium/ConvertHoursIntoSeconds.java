package task17Medium;

public class ConvertHoursIntoSeconds {
    public static void main(String[] args) {
        System.out.println(Challenge.howManySeconds(2));
        System.out.println(Challenge.howManySeconds(10));
        System.out.println(Challenge.howManySeconds(24));
    }
}

class Challenge {
    public static int howManySeconds(int hours) {
        return hours * 60 * 60;
    }
}