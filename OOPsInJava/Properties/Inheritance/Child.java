package OOPsInJava.Properties.Inheritance;

public class Child extends Parent{
    int weight;

    Child(int a){
        super(a);
        l = 5;
        System.out.println("hey child");
    }


    Child(int l,int b,int w,int weight){
//        super();
        super(l,b,w);
        this.weight = weight;

    }


}
