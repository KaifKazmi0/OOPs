package interfaces;

public interface Multimedia {
    default void start(){
        System.out.println("hello");
    };
    default void stop(){
        System.out.println("bye");
    };

}
