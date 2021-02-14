package academy.learnprogramming.classdesign.abstractclasses;

public abstract class Animal2 {

    private int age;
    //    protected String name;
    private String name;

    public Animal2() {};

    public Animal2(int age) {
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

    public void eat() {                 //if this is deleted, can't call super. in child class
        System.out.println("animal is eating.");
    }

    public double getAverageWeight() {
        return 10.0;
    }

//    public abstract void printName();

    protected abstract void printName();

    public void printDetails() {            //this will be available to all children, no need to duplicate it in each child class using getters/setters
        //if access modifier protected, will compile when called inside main bc all in same package
//        System.out.println("name= " + name + "age= " + age);  //don't have to call getter/setter like in HuskyExtendsDog bc Animal's private fields available for use here
        printName();
        System.out.println("Age= " + age);
    }


    ////////////////////////////ABSTRACT METHODS
//    public static abstract void run(); //can't be static and abstract at same time

//    public abstract void run() {}; //won't compile bc there's a body

    public abstract int getWeight(); //this must be implemented in every child class
}

