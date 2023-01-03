package academy.learnprogramming;


import java.text.DecimalFormat;
import java.util.Scanner;

public class BaseBurger {
    Price additions = new Price();
    private double price;
    private String name;


    public BaseBurger(double price, String name) {
        this.price = price;
        this.name = name;
    }


    public void menuWithAdditions() {
        Scanner scanner = new Scanner(System.in);
        //Price additions = new Price();
        boolean isAdditions = true;
        while (isAdditions) {
            System.out.println("\nMenu with additions: \n \n" +
                    "0) Exit from menu \n" +
                    "1) Lettuce = 0.50$ \n" +
                    "2) Tomato = 0.45$ \n" +
                    "3) Carrot = 0.24$ \n" +
                    "4) Cheese = 0.66$");
            int menu = scanner.nextInt();
            if (menu >= 0 && menu < 5) {
                DecimalFormat numberFormat = new DecimalFormat("#.00");
                switch (menu) {
                    case 1:
                        this.price += additions.lettucePrice;
                        System.out.println("Lettuce added.");
                        System.out.println("Burger price = " + (numberFormat.format(this.price)) + "$");
                        break;
                    case 2:
                        this.price += additions.tomatoPrice;
                        System.out.println("Tomato added.");
                        System.out.println("Burger price = " + (numberFormat.format(this.price)) + "$");
                        break;
                    case 3:
                        this.price += additions.carrotPrice;
                        System.out.println("Carrot added.");
                        System.out.println("Burger price = " + (numberFormat.format(this.price)) + "$");
                        break;
                    case 4:
                        this.price += additions.cheesePrice;
                        System.out.println("Cheese added.");
                        System.out.println("Burger price = " + (numberFormat.format(this.price)) + "$");
                        break;
                    case 0:
                        System.out.println("Burger price = " + (numberFormat.format(this.price)) + "$");
                        isAdditions = false;
                        break;
                }
            } else {
                System.out.println("Incorrect number!");
            }
        }
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
