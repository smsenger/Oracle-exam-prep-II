package academy.learnprogramming.classdesign;

public class HuskyExtendsDog extends DogExtendsAnimal {   //by extension a child of Object

    public HuskyExtendsDog(int age) {
        super(age);
        System.out.println("Husky");
    }

    public void printDetails() {            //this will only be available to use for instances of HuskyExtendsDog class
        System.out.println("name= " +getName() + "age= " + getAge());
    }

    @Override
    public void eat() {
        super.eat();  //this calls super.eat() in DogExtendsAnimal, which calls the method in Animal class
        System.out.println("Husky is eating.");
    }
}
