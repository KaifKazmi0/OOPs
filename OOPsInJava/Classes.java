package OOPsInJava;

import Strings.First;

public class Classes {
    //getter and setter
    public static void main(String[] args) {
        First f = new First();
        System.out.println(f.name);

//        System.out.println(f.rno);
        System.out.println(f.getRno());
        f.setRno(76);
        System.out.println(f.getRno());
    }
}
