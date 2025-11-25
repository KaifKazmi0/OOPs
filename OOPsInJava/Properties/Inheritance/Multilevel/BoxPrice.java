package OOPsInJava.Properties.Inheritance.Multilevel;

public class BoxPrice extends BoxWeight{

    int price ;

    BoxPrice(){
        super();
        System.out.println("Boxprice empty constructor");
        this.price = -1;
    }

    BoxPrice(int l,int b,int w,int weight ,int price){
        super(l,b,w,weight);
        this.price = price;
    }

    BoxPrice(int side,int weight,int price){
        super(side,weight);
        this.price = price;
    }




}
