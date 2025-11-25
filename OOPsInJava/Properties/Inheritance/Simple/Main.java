package OOPsInJava.Properties.Inheritance.Simple;

public class Main {

    public static void main(String[] args) {


        //Child constructor runs
        //
        //The first line must be super(...)
        //
        //Parent constructor receives value
        //
        //After parent finishes, child constructor continues
        Parent obj = new Child(2);
        System.out.println(obj.l+" "+obj.w+" "+obj.h);  // 5 2 2


        Child c1 = new Child(1,2,3,4);
        System.out.println(c1.w+" "+c1.h+" "+c1.l+" "+c1.weight);
    }
}

