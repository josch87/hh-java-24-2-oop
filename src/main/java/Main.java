import domain.Book;
import domain.Car;
import domain.Library;
import domain.Person;

public class Main {
    public static void main(String[] args) {
        Car aljoschasCar = new Car();
        aljoschasCar.startEngine();

        Car schumisCar = new Car();
        schumisCar.accelerate(280);
        System.out.println(schumisCar.speed);

        Person aljoscha = new Person("Aljoscha", "Zöller", 20, "Male");
        System.out.println(aljoscha.introducePerson());

        Person thomas = new Person("Thomas", 50, "Diverse");
        System.out.println(thomas.introducePerson());

        Person michael = new Person();
        michael.lastName = "Schumacher";
        System.out.println(michael.introducePerson());

        Person johannes = new Person();
        System.out.println(johannes.introducePerson());

        Book[] booksArray1 = {
            new Book("978-0132350884", "Effective Java", "Joshua Bloch", "Daniel"),
            new Book("978-0132350885", "Effective Java Teil 2", "Joshua Bloch JR", "Viktor"),
            new Book("978-0132350886", "Effective Java Advanced", "Joshua Bloch SR", "Aljoscha")
        };

        Library myLibrary = new Library(booksArray1);

        System.out.println(myLibrary);


    }
}
