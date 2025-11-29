package interfaces.ExtendsDemo;

public class Main implements B{
    @Override
    public void greet() {
        System.out.println("I am from B");
    }

    @Override
    public void func() {
        System.out.println("I am from A");
    }
    public static void main(String[] args){
        Main mn = new Main();
        mn.greet();
        mn.func();
    }

}
