package academy.learnprogramming;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name2) {
        this.lastName = name2;
    }

    public void setAge(int ageValue) {
        if(ageValue < 0 || ageValue > 100) {
            this.age = 0;
        } else {
            this.age = ageValue;
        }
    }

    public boolean isTeen() {
        return (this.age > 12 && this.age < 20);
    }

    public String getFullName() {
        if(this.firstName.isEmpty() && this.lastName.isEmpty()) {
            return "";
        } else if (this.lastName.isEmpty()) {
            return this.firstName;
        } else if (this.firstName.isEmpty()) {
            return this.lastName;
        }
        return (this.firstName + " " + this.lastName);
    }
}
