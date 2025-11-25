package OOPsInJava.Properties.Inheritance.Multilevel;

public class BoxWeight extends BOX{
    int weight;

    BoxWeight(){
        super();
        this.weight = -1;
    }

    BoxWeight(int side,int weight){
        super(side);
        this.weight = weight;
    }

    BoxWeight(int l,int b,int w,int weight){
        super(l,b,w);
        this.weight = weight;
    }


    public BoxWeight(int l, int b, int weight) {
        //not giving super keyword , java will call super(); by default
        this.weight = weight;
    }
}
