package academy.learnprogramming.classdesign;

public class Animal { //this has child classes dogextends and husky and cat
                    //automatically extends Object

    private int age;
//    protected String name;
    private String name;

    public Animal() {};

    public Animal(int age) {
        System.out.println("Animal");
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("animal is eating.");
    }

    public double getAverageWeight() {
        return 10.0;
    }

    public void printDetails() {            //this will be available to all children, no need to duplicate it in each child class using getters/setters
                                            //if access modifier protected, will compile when called inside main bc all in same package
        System.out.println("name= " + name + "age= " + age);  //don't have to call getter/setter like in HuskyExtendsDog bc Animal's private fields available for use here
    }
}
