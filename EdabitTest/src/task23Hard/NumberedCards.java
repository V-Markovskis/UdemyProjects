package task23Hard;

import java.util.Arrays;

public class NumberedCards {
    public static void main(String[] args) {
        System.out.println(NumberedCard.winRound(new int[]{2, 5, 2, 6, 9}, new int[]{3, 7, 3, 1, 2}));
        System.out.println(NumberedCard.winRound(new int[]{2, 5, 2, 6, 9}, new int[]{3, 7, 3, 1, 2}));
        System.out.println(NumberedCard.winRound(new int[]{1, 2, 3, 4, 5}, new int[]{9, 8, 7, 6, 5}));
        System.out.println(NumberedCard.winRound(new int[]{4, 3, 4, 4, 5}, new int[]{3, 2, 5, 4, 1}));
    }
}

class NumberedCard {
    public static boolean winRound(int[] you, int[] opp) {
        Arrays.sort(you);
        Arrays.sort(opp);

        String createNumYou = String.valueOf(you[you.length - 1]) + you[you.length - 2];
        String creteNumOpp = String.valueOf(opp[opp.length - 1]) + opp[opp.length - 2];

        return Integer.parseInt(createNumYou) > Integer.parseInt(creteNumOpp);
    }
}
