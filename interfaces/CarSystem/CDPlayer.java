package interfaces.CarSystem;

public class CDPlayer implements MediaPlayer{
    @Override
    public void start() {
        System.out.println("Media player start");
    }

    @Override
    public void stop() {
        System.out.println("Media player stop");
    }
}
