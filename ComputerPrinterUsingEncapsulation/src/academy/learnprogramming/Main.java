package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(40, 5, true);
        System.out.println("Toner level is " + printer.getTonerLevel() + " %");
        System.out.println("Current number of pages in printer = " + printer.getNumOfPages());
        System.out.println("If printer is duplex = " + printer.isDuplex());

        printer.fillTheToner(80);
        printer.printingPages(5);
    }
}
