package academy.learnprogramming.classdesign;

class Dog {

    private String color;

    public Dog(String color) {
        System.out.println("constructor");
        this.color = color; // this. refers to the class, adds the property, set to same value as parameter

        //if parameter was theColor, wouldn't need this. bc the var name isn't the same as the parameter
    }
    //public dog() {} //won't work bc dog not same as Dog
    //public void Dog(){} //is not constructor bc it has a return type, will compile

    public void printColor() {
        System.out.println("color= " + color);  //this. only required when have same parameter name as variable -- not here
    }
}


class Cat {
    private String color;
    private int height;
    private int length;

    public Cat(int length, int theHeight) {
        //length = this.length; //not good because length will equal zero
        this.length = length;
        height = theHeight; //var not same as parameter, so no this. required
        color = "white";
    }

    public void printInfo() {
        System.out.println("Cat length= " + length + "height= " + height + "color= " + color);
    }
}

public class ClassConstructors {

    public static void classConstructors() {
        Dog dog = new Dog("gray"); //this calls the constructor to creat Dog dog, requires parameter defined in constructor method
        //Dog on left side refers to class, right side refers to constructor
        dog.printColor(); //create instance of Dog class, define color and print with printColor method

        Cat cat = new Cat(10, 12);
        cat.printInfo();
    }
}
