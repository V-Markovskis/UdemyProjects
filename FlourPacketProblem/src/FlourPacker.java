public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        boolean solution = false;
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return solution;
        }
        bigCount = bigCount * 5;

        while (bigCount != 0 && goal >= 5) {
            goal = goal - 5;
            bigCount = bigCount - 5;
        }
        while (smallCount != 0 && goal >=1){
            goal = goal -1;
            smallCount = smallCount - 1;
        }
        if (goal <= 0) {
            solution = true;
            return solution;
        } else {
            return solution;
        }
    }
}
