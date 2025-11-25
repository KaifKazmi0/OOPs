package OOPsInJava.StaticExmple;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "kunal", 10000);
        Human rohit = new Human(20,"rohit",15000);
        Human arpit = new Human(19,"arpit",14000);

        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

        //without static keyword
        System.out.println(kunal.population1);
        System.out.println(rohit.population1);
        System.out.println(arpit.population1);
    }
}
