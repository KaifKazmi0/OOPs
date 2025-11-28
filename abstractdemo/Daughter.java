package abstractdemo;

public class Daughter extends Parent{

    Daughter(int age){
        super(age);
    }
    @Override
    void career(){
        System.out.println("I want to be a Coder");
    }

    @Override
    void partner(){
        System.out.println("I love Iron man");
    }


}
