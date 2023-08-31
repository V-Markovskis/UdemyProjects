package task15Medium;

import static task15Medium.Challenge.canCapture;

public class CaptureTheRock {
    public static void main(String[] args) {
        System.out.println(canCapture(new String[]{"A8", "E8"}));
        System.out.println(canCapture(new String[]{"A1", "B2"}));
        System.out.println(canCapture(new String[]{"H4", "H3"}));
        System.out.println(canCapture(new String[]{"F5", "C8"}));
    }
}

class Challenge {
    public static boolean canCapture(String[] rooks) {
        return (rooks[0].charAt(1) == rooks[1].charAt(1) || (rooks[0].charAt(0) == rooks[1].charAt(0)));
    }
}
