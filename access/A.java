package access;

public class A {
     protected int num;
    protected String name;
    int[] arr;

    public A(){

    }



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public A(int num, String name){
        this.num = num;
        this.name = name;
        this.arr = new int[20];
    }
}
