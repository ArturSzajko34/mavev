package Zjazd5.Task6;




public class Car {

    private final Engine engine;
    private final AutoPilot autoPilot;


    public Car(Engine engine, AutoPilot autoPilot) {
        System.out.println("Car" + getClass().getSimpleName());
        this.engine = engine;
        this.autoPilot = autoPilot;
    }

    public void drive(){
        engine.start();
        autoPilot.driveAuto();
    }
}
