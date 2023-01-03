public class SharedDigit {
    public static boolean hasSharedDigit(int firstNum, int secondNum) {
        if (firstNum < 10 || firstNum > 99 || secondNum < 10 || secondNum > 99) {
            return false;
        }

        int sharedNumFromFirstNum;
        int sharedNumFromSecondNum;
        for (int i = firstNum; i != 0; i /= 10) {
            sharedNumFromFirstNum = i;
            sharedNumFromFirstNum %= 10;
            for (int j = secondNum; j != 0; j /= 10) {
                sharedNumFromSecondNum = j;
                sharedNumFromSecondNum %= 10;
                if (sharedNumFromFirstNum == sharedNumFromSecondNum) {
                    return true;
                }
            }
        }
        return false;
        }
//        int sharedNumFromFirstNum = 0;
//        int sharedNumFromSecondNum = 0;
//        while (firstNum != 0 || secondNum != 0) {
//            sharedNumFromFirstNum = firstNum % 10;
//            firstNum /= 10;
//
//            sharedNumFromSecondNum = secondNum % 10;
//            secondNum /= 10;
//
//            if(sharedNumFromFirstNum == sharedNumFromSecondNum) {
//                return true;
//            }
//        }
//        return false;
    
}
