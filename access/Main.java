package access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(34,"Kaif");
        //Now we need to do two things here
        //1.Access A class members
        //2.Modify A class members

//        System.out.println(obj.num);
        System.out.println(obj.getNum());
        System.out.println(obj.name);
    }
}
