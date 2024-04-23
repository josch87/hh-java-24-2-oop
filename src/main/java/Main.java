import domain.Car;
import domain.Person;

public class Main {
    public static void main(String[] args) {
        Car aljoschasCar = new Car();
        aljoschasCar.startEngine();

        Car schumisCar = new Car();
        schumisCar.accelerate(280);
        System.out.println(schumisCar.speed);

        Person aljoscha = new Person("Aljoscha", "Zöller", 36, "Male");
        System.out.println(aljoscha.introducePerson());

        Person thomas = new Person("Thomas", 50, "Male");
        System.out.println(thomas.introducePerson());

    }
}
