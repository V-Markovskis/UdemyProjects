package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Burk");
        dog.eat();
        dog.breathe();


        Parrot parrot = new Parrot("York");
        parrot.eat();
        parrot.breathe();
        parrot.fly();
    }
}
