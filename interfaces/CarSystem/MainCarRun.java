package interfaces.CarSystem;

public class MainCarRun {
    public static void main(String[] args) {
        NiceCar car  = new NiceCar();
        CDPlayer player = new CDPlayer();

        car.start();
        car.acc();
        car.stop();

        car.upgradeEngine();
        car.start();

        player.start();
        player.stop();


    }
}
