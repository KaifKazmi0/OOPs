package abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(27);
        daughter.career();


//        Parent parent = new Parent;  //not allowed to make constructor of abstract class
    }
}
