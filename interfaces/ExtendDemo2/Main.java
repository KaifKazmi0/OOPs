package interfaces.ExtendDemo2;

public class Main implements B {
    @Override
    public void greet() {
        System.out.println("I am from B");
    }



    public static void main(String[] args){
        Main mn = new Main();
        mn.greet();
        A.fun();   // calling using A without creating object
    }

}
