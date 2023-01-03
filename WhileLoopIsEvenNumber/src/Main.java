public class Main {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int totalNumFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber.isEvenNumber(number)){
                continue;
            }
            totalNumFound++;
            System.out.println("Even number " + number);
            if (totalNumFound == 5) {
                break;
            }
        }
        System.out.println("Total numbers found " + totalNumFound);
    }
}
