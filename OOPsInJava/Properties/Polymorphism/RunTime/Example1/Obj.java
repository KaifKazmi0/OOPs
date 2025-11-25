package OOPsInJava.Properties.Polymorphism.RunTime.Example1;



public class Obj {

    static class abc extends Object{
        int l = 9;


        @Override
        public  String toString() {
            return "l is equals to"+ l;
        }

    }


    public static void main(String[] args) {
        abc obj = new abc();
        System.out.println(obj);
    }



}
