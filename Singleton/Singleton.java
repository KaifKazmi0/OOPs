package Singleton;
//Singleton class means only one object of a class can be created
public class Singleton {
    private Singleton(){}

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
