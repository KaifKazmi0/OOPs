package OOPsInJava.Properties.Polymorphism.CompileTime;

public class Overloading {
    void print(){
        System.out.println("nill para method");
    }
    void print(int a){
        System.out.println("one parameter method"+a);
    }
    int print(int a , int b){

        return a+b;
    }
    int print(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        obj.print();
        obj.print(5);
        System.out.println(obj.print(2,3));
        System.out.println(obj.print(1,2,3));
    }
}
