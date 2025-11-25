public class WrapperClass {
    public static void main(String[] args) {
        //this is stored in stack memory and is not treated a object
        int a = 5;

        //this is storee in heap and is stored in heap
        Integer aa = 5;


        final int ab = 5;
        // Can't be change to  ab = 6 in Primitive-Datatypes;

        final int num;
        System.out.println(aa.toString());
    }
}
