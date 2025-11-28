package access;

public class B {



    public static void main(String[] args) {
        A a = new A(42, "kaif");
        System.out.println(a.num);
        System.out.println(a.name);
        System.out.println(a.getNum());
        a.setNum(24);
        System.out.println(a.getNum());
    }
}
