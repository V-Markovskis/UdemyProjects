package CodingGameTest1;

import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();

        in.nextLine();

        String firstList = "";
        String secondList = "";


        for (int i = 0; i < length; i++) {
            String part1 = in.nextLine();
            firstList += part1;
        }
        for (int i = 0; i < length; i++) {
            String part2 = in.nextLine();
            secondList += part2;
        }

        String[] splitPart1 = firstList.split("");
        String[] splitPart2 = secondList.split("");

        for(int i = 0; i < splitPart1.length; i++) {
            for(int j = 0; i < splitPart2.length; i++) {
                if(splitPart1[i].equals(splitPart2[j])) {
                    System.out.println(i);
                } else {
                    System.out.println("NONE");
                }
            }
        }
    }
}
