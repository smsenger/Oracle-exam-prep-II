package academy.learnprogramming.classdesign;

class Dog3 {
    private String name;
    private String breed;
    private double weight;

    public Dog3(String name) {
//        this.name = name;
//        breed= "husky";
//        weight = 30.0;

        //Dog3(name, "husky"); //will not compile
//        new Dog3(name, "husky"); //will compile but will not initialize any variables, just new instance of Dog3
        this(name, "husky");  //this() calls a different constructor, in this case it initializes dog w/1st constructor, then calls 2nd constructor
        System.out.println("constructor 1"); //will print this 3rd

    }

    public Dog3(String name, String breed) {
//        this.name = name;
//        this.breed = breed;
//        weight = 30.0;
        this(name, breed, 30.0);//this calls 3rd constructor, chaining
        System.out.println("constructor 2"); //will print this 2nd
    }

    public Dog3(String name, String breed, double weight) { //this does all the work, calling 2nd then 1st constructor to initialize instances
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        System.out.println("constructor 3"); //will print this 1st
    }

    public void print() {
        System.out.println(name + " " + breed + " " + weight);
    }
}

public class OverloadingConstructors {

    public static void overloadingConstructors() {  //will print these dogs after previous 3 constructors
        Dog3 dog3 = new Dog3("Jimmy"); //const 1 called
        dog3.print();

        Dog3 dog4 = new Dog3("Anthony", "shepherd"); //const 2 called
        dog4.print();

        Dog3 dog5 = new Dog3("Rex", "german shepherd", 40); //const 3 called
        dog3.print();
    }
}
