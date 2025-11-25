package OOPsInJava.StaticExmple;

public class Human {
    int age;
    String name;
    int salary;
    static long population;
    long population1;
    Human(int age,String name,int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population +=1;
        this.population1 +=1;
    }

}
