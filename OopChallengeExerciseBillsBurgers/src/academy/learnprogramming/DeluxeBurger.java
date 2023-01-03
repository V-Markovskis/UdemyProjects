package academy.learnprogramming;

import java.text.DecimalFormat;

public class DeluxeBurger extends BaseBurger {
    private int chips;
    private String drink;
    double deluxeBurgerPrice = getPrice();
    DecimalFormat numberFormat = new DecimalFormat("#.00");
    // Price price = new Price();

    public DeluxeBurger(double price, String name, int chips, String drink) {
        super(price, name);
        this.chips = chips;
        this.drink = drink;
    }

    public void DeluxeBurgerAdditions() {
        double chipsFinalPrice = additions.chipsPrice * this.chips;

        this.deluxeBurgerPrice += chipsFinalPrice;
        this.deluxeBurgerPrice += additions.drinkPrice;

        System.out.println("Deluxe burger price = " + numberFormat.format(deluxeBurgerPrice) + "$");
    }

    public int getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }
}
