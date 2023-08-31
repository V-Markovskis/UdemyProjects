package task2;

public class ShuffleTheName {
    public static void main(String[] args) {
        String name = "Trump Donald";
        System.out.println(Program.nameShuffle(name));
    }
}

class Program {
    public static String nameShuffle(String s) {
        String[] word = s.split(" ");
        return word[1] + " " + word[0];
    }
}

