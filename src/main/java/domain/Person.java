package domain;

public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public String gender;

    public Person (String firstName, int age, String gender) {
        this.firstName = firstName;
        this.age = age;
        this.gender = gender;
    }

    public Person(String firstname, String lastName, int age, String gender) {
        this.firstName = firstname;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public void printFullName() {
        System.out.println(getFullName());
    }

    public String getFullName() {
        String fullName = "";

        if (firstName != null && lastName != null) {
            return firstName + " " + lastName;
        }

        if (firstName != null) {
            fullName = firstName;
        }
        if (lastName != null) {
            fullName = lastName;
        }

        return fullName;
    }

    public String introducePerson() {
        return "Hello, I am " + getFullName() + ", I am " + age + " years old and I am a " + gender + ".";
    }


}
