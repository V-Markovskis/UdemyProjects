package task21Hard;

public class ValidatePin {
    public static void main(String[] args) {
        System.out.println(PersonalIdNumber.validate("123456"));
        System.out.println(PersonalIdNumber.validate("1234"));
    }
}

class PersonalIdNumber {
    public static boolean validate(String pin) {
        return pin.matches("^(\\d{4}|\\d{6})$");
    }
}
