package academy.learnprogramming.classdesign;

class Example {
    private String name = "dog";

    {                               //instance initializer
        System.out.println(name);
    }

    private static int COUNT = 0;

    static {                        //static initializer
        System.out.println(COUNT);
    }

    {
        COUNT += 10;
        System.out.println(COUNT);
    }

    public Example() {                  //constructor
        System.out.println("constructor");
    }
}

class Demo {

    static {
        add(2);
    }

    static void add(int number) {
        System.out.print(number + "");
    }

    Demo() {            //constructor
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new Demo();
    }

    {
        add(8);
    }
}

public class OrderOfInitialization {

    public static void orderOfInitialization() {
        new Example();  //prints 0, dog, 10, constructor: static, instance, constructor in order appear in file
                        //Example not assigned to any variable, just instance of class
        new Demo();  //2 4 6 8 5 6 8 5  --> goes through static, instance, constructor, then this constructor calls instance initializers: 6, 8, 5
    }
}
