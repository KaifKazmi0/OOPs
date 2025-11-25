package OOPsInJava.Properties.Inheritance.Multilevel;

public class BOX {
    int l;
    int b;
    int w;

    BOX(){
        super();
        System.out.println("Constructor from empty input");
        this.l = -1;
        this.b = -1;
        this.w = -1;
    }

    BOX(int side){
        System.out.println("constructor from one input");
        this.l = side;
        this.w = side;
        this.b = side;
    }

    BOX(int l,int b,int w){
        System.out.println("Constructor from 3 input");
        this.l = l;
        this.b = b;
        this.w = w;
    }



}
