package OOPsInJava;
import java.lang.*;
import java.util.*;

public class Finalize {
    public static void main(String[] args) {
        final A kunal = new A();
        System.out.println(kunal.name);
        System.out.println(kunal.rolnum);

//        kunal = new A();
        A obj ;
        for (int i=0;i<=10000;i++){
            obj = new A();
        }
    }
    static class A{
        final int rolnum;
        String name;

       A(){
           this.rolnum = 2;
           this.name = "Rohan";
       }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Object is destroyed...");
        }
    }

}
