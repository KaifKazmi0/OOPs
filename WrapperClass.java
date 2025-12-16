public class WrapperClass {
    public static void main(String[] args) {

        // primitive variable i.e.stored in stack
        int a = 5;

        // Wrapper object (stored in heap, reference in stack)
        Integer aa = 5; // autoboxing

        // final primitive (value cannot be changed) will still be stored in stack
        final int ab = 5;

        // final variable must be initialized once
        final int num;
        num = 10;

        System.out.println(aa.toString()); // prints 5


        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b); // true (cached)

        Integer x = 200;
        Integer y = 200;
        System.out.println(x == y); // false (not cached)

    }
}
