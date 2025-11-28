package Singleton;

import access.A;

public class B extends A{

    B(int num,String name){
        super(num,name);
    }


    public static void main(String[] args) {
        B a = new B(24, "kaif");
//        A a = new A(24,"kaif");
        System.out.println(a.name);
        System.out.println(a.getNum());
        a.setNum(24);
        System.out.println(a.getNum());
    }
}
