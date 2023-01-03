package academy.learnprogramming;


import java.text.DecimalFormat;
import java.util.Scanner;

public class HealthyBurger extends BaseBurger {

    Scanner scanner = new Scanner(System.in);


    public HealthyBurger(double price, String name) {
        super(price,name);
    }

    @Override
    public void menuWithAdditions() {
        super.menuWithAdditions();
        //Price additions = new Price();
        boolean isAdditions = true;
        double healthyBurgerPrice = this.getPrice();
        while (isAdditions) {
            System.out.println("Healthy burger have extended additions: \n" +
                                "0)Exit \n" +
                                "1)Cucumber = 0.70$ \n" +
                                "2)Avocado = 1.01$");
            int menu = scanner.nextInt();
            if(menu >= 0 && menu < 3){
                DecimalFormat numberFormat = new DecimalFormat("#.00");
                switch (menu) {
                    case 1:
                        healthyBurgerPrice += additions.cucumberPrice;
                        System.out.println("Cucumber added.");
                        System.out.println("Burger price = " + (numberFormat.format(healthyBurgerPrice)));
                        break;
                    case 2:
                        healthyBurgerPrice += additions.avocadoPrice;
                        System.out.println("Avocado added.");
                        System.out.println("Burger price = " + (numberFormat.format(healthyBurgerPrice)));
                        break;
                    case 0:
                        System.out.println("Healthy burger price = " + (numberFormat.format(healthyBurgerPrice)) + "$");
                        isAdditions = false;
                        break;
                }
            } else {
                System.out.println("Incorrect number!");
            }
        }

    }
}
