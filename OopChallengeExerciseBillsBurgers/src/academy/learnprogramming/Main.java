package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        BaseBurger baseBurger = new BaseBurger(2.44, "Basic");
        baseBurger.menuWithAdditions();

        HealthyBurger healthyBurger = new HealthyBurger(4.44, "PoolParty");
        healthyBurger.menuWithAdditions();

        DeluxeBurger deluxeBurger = new DeluxeBurger(3.54,"Deluxe", 2, "Cola");
        deluxeBurger.DeluxeBurgerAdditions();
    }
}
