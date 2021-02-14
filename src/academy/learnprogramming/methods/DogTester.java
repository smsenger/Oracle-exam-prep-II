package academy.learnprogramming.methods;

public class DogTester {

    public static void main(String[] args) {
        Dog husky = new Dog();
        System.out.println(husky.count);//warning: accessing ref variable through instance

        System.out.println(Dog.count);//can access w/o new instance

        Dog anotherDog = new Dog();
        anotherDog.incrementCounter();//warning: calling static method with instance variable, increments to 1

        Dog.incrementCounter();//the way to call static method, increments to 1

        System.out.println(Dog.count);//adds 1 + 1 to get 2

        husky = null;
        anotherDog = null;

        System.out.println(Dog.count);
        System.out.println(husky.count); //no null pointer exception
        System.out.println(anotherDog.count); //no null pointer exception
                                                //a static variable is shared between all instances, so each of these prints 2

        Dog.count = 10;
        Dog newDog = new Dog();
        Dog dog2 = new Dog();
        newDog.count = 5;


        System.out.println(Dog.count);//all 3 print same count: 5

        newDog.count = 11;


        System.out.println(Dog.count); //prints 11, when change value of one instance, changes value of other instances, static = share
        System.out.println(newDog.count);//these two also print 11 now because count has been set above
        System.out.println(dog2.count);
    }
}
