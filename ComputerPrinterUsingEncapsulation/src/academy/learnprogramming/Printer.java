package academy.learnprogramming;

public class Printer {

    private int tonerLevel;
    private int numOfPages;
    private boolean isDuplex;

    public Printer(int tonerLevel, int numOfPages, boolean isDuplex) {
        this.tonerLevel = tonerLevel;
        this.numOfPages = numOfPages;
        this.isDuplex = isDuplex;
    }

    public void fillTheToner(int percentsOfToner) {
        if (this.tonerLevel >= 0 && this.tonerLevel < 100) {
            for (; this.tonerLevel < 100 && percentsOfToner != 0; percentsOfToner--) {
                this.tonerLevel++;
            }
        }
        System.out.println("Toner level equals " + this.tonerLevel + " %");
    }

    public void printingPages(int page) {
        int counterOfPrintedPages = 0;
        for(int i = 1; i <= page; i++) {
            if(this.tonerLevel < 10) {
                System.out.println("Fill the toner please");
                break;
            }
            if(isDuplex) {
                this.tonerLevel -= 10;
            } else {
                this.tonerLevel -= 5;
            }
            counterOfPrintedPages++;
        }

        System.out.println("Successfully printed " + counterOfPrintedPages + " pages");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
