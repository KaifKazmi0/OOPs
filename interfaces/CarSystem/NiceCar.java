package interfaces.CarSystem;



public class NiceCar {

    private Engine engine;
    private MediaPlayer player = new CDPlayer();


    NiceCar(MediaPlayer player){
        this.player = player;
    }


    NiceCar(){
        engine = new PowerEngine();
    }

    NiceCar(Engine engine){
        this.engine = engine;
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }


    public void acc(){
        engine.acc();
    }

    public void startP(){
        player.start();
    }

    public void stopP(){
        player.stop();
    }


    public void upgradeEngine(){
        this.engine = new ElectricEngine();
    }






}
