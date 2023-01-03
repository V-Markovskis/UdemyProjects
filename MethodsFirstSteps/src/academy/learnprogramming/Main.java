package academy.learnprogramming;

public class Main {
    //
    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);
//    }
//
//    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            return finalScore;
//        }
//        return -1;
//    }
        String player1 = "Bob";
        String player2 = "Sam";
        String player3 = "Dean";
        String player4 = "Kass";

        displayHighScorePosition(player1, calculateHighScorePosition(1500));

        displayHighScorePosition(player2, calculateHighScorePosition(900));

        displayHighScorePosition(player3, calculateHighScorePosition(400));

        displayHighScorePosition(player4, calculateHighScorePosition(50));

    }
    public static void displayHighScorePosition(String playersName, int position) {
        System.out.println(playersName + " managed to get into position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
//    }
        int position = 4; //assuming position 4 will be returned
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}

