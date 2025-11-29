package interfaces.Nested;

public class Demo {
    //nested interface
    //it can be declared as public , private or protected
    //But top level interface has to be declared as public or default on
    interface A{
        public boolean isOdd(int num);
    }
}

class B implements Demo.A{
    @Override
    public boolean isOdd(int num){
        return (num & 1) == 1;
    }
}