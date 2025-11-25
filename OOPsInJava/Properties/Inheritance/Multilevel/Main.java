package OOPsInJava.Properties.Inheritance.Multilevel;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        //Empty constructor call
//        BoxWeight box1 = new BoxWeight();
//        System.out.println("Result from empty constructor call");
//        System.out.println(box1.l+" "+box1.b+" "+box1.w+" "+ box1.weight);
//
//        //2 input constructor
//        BoxWeight box2 = new BoxWeight(4,5);
//        System.out.println("Result from 2 input constructor");
//        System.out.println(box2.l+" "+box2.b+" "+box2.w+" "+box2.weight);


//        //3 input constructor
//        BoxWeight box3 = new BoxWeight(3,3,33);
//        System.out.println("result from 3 input constructor");
//        System.out.println(box3.l+" "+box3.b+" "+box3.w+" "+box3.weight);
//
//
//
//        //4 input constructor
//        BoxWeight box4 = new BoxWeight(1,2,3,4);
//        System.out.println("Result from 4 input constructor");
//        System.out.println(box4.l+" "+box4.b+" "+box4.w+" "+box4.weight);
//
//



        //empty constructor call
        BoxPrice box5 = new BoxPrice();
        System.out.println("result from empty constructor");
        System.out.println(box5.l+" "+box5.b+" "+box5.w+" "+box5.weight+" "+ box5.price);


        //constructor with 5 input
        BoxPrice box6 = new BoxPrice(1,2,3,4,5);
        System.out.println("result from 5 input constructor");
        System.out.println(box6.l+" "+box6.b+" "+box6.w+" "+box6.weight+" "+box6.price);



        //contrucotor with 3 inputs
        BoxPrice box7 = new BoxPrice(11,22,33);
        System.out.println("result from 3 input constructor");
        System.out.println(box7.l+" "+box7.b+" "+box7.w+" "+box7.weight+" "+box7.price);

    }
}
