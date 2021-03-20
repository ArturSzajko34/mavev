package Task4;

public class Maine {
    public static void main(String[] args) {

        Engine engine = new Engine();


        Car car = new Car(engine);
        car.drive();
    }
}
