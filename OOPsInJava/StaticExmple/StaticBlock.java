package OOPsInJava.StaticExmple;

public class StaticBlock {
    static int a  = 5;
    static int b;

    //static block will run only once,when the first object is created i.e. When the class is loaded for the first time

    static {
        System.out.println("I am static block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj  = new StaticBlock();
        System.out.println(a+" "+StaticBlock.b);

        b = b-2;
        StaticBlock obj1 = new StaticBlock();
        System.out.println(StaticBlock.a+" "+StaticBlock.b);
    }
}
