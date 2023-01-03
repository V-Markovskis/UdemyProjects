package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	    char character = 'B';
	    switch (character) {
            case 'A':
                System.out.println("It is A");
                break;
            case 'B':
                System.out.println("It is " + character);
                break;
            case 'C':
                System.out.println("It is C");
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
