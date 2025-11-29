package interfaces.InterfaceBasics;

public class Car implements Engine,Brake,Multimedia{


    @Override
    public void brake() {
        System.out.println("I am brake of the car");
    }

    @Override
    public void start() {
        System.out.println("I am start of the car");
    }

    @Override
    public void stop() {
        System.out.println("I am stop of the car");
    }

    @Override
    public void acc() {
        System.out.println("I am accelerating the car");
    }
}
