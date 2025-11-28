package abstractdemo;

public class Son extends Parent{

    Son(int age){
        super(age);
    }



    @Override
    void career(){
        System.out.println("I want to be a Doctor");
    }

    @Override
    void partner(){
        System.out.println("I love pepper pots");
    }


}
