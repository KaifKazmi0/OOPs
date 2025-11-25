package OOPsInJava.Properties.Polymorphism.RunTime;

public class Main {
    public static void main(String[] args) {
        Shapes obj = new Shapes();
        Circle c = new Circle();
        Square s = new Square();
        Triangle t = new Triangle();


        //Upcasting
        Shapes ss1 = new Circle();
        Shapes ss2 = new Shapes();
        Shapes ss3 = new Square();

        //Upcasting calling
        ss1.Area();
        ss2.Area();
        ss3.Area();

        System.out.println();

        obj.Area();
        c.Area();
        s.Area();
        t.Area();
    }
}
