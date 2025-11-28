package Singleton;

public class BB extends B{
    BB(int num,String name){
        super(num,name);
    }

    public static void main(String[] args) {
        BB a = new BB(23,"Auon");
        System.out.println(a.name);
        System.out.println(a.num);
    }
}
