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
    }
}
