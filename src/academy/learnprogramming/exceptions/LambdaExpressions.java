package academy.learnprogramming.exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Animal {
    private String type;
    private boolean canJump;
    private boolean canSwim;

    public Animal(String type, boolean canJump, boolean canSwim) {
        this.type = type;                       //when creating new Animal, provide these as parameters, in order
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    public boolean canJump() {
        return canJump;
    }

    public boolean canSwim() {
        return canSwim();
    }

    public String getType() {
        return type;
    }
}

interface CheckAnimal {
    boolean check(Animal animal);
}

class CheckCanJump implements CheckAnimal {
    @Override
    public boolean check(Animal animal) {
        return animal.canJump();
    }
}

interface AnotherCheck {
    boolean check(Animal first, Animal second);
}

public class LambdaExpressions {

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("dog", true, true));

        print(animals, new CheckCanJump()); //calls method below on each animal above and CheckCanJump instance as the filter
        //CheckCanJump implements method check() that checks whether an animal can jump

        print(animals, animal -> animal.canSwim());  //this will call canSwim for each animal in animals, does this without creating a new class
        //and implementing/overriding the check method from interface CheckAnimal, refers to CheckAnimal automatically
        //can use {} after arrow if desired, not required for single line
        print(animals, animal -> !animal.canSwim()); //animals that can't swim

        print(animals, (Animal animal) -> {
            return animal.canJump();
        }); //return is not required bc only 1 statement, if a comment or any other code is added after the ; compiler will require a return

        print(animals, (Animal animal) -> {
//            Animal animal = new Animal("cat", true, false); //won't compile: can't var use same name as parameter
            System.out.println("checking animal= " + animal.getType()); //prints this for fish, rabbit, and dog
            return animal.canJump();    //return is required bc more than 1 statement inside the body
            //print() method calls CheckAnimal, which calls implementation in CheckCanJump, so must return a boolean by calling canJump();
        });

        Animal fish = animals.get(0); //this creates a new object from item 0 in the List
        Animal rabbit = animals.get(1);
        Animal dog = animals.get(2);

        print(fish, rabbit, (first, second) -> first.canSwim() && second.canSwim());  //if these are true then first print method below will just print boolean from interface
        //this has both parameters outlined in the interface and in method below
        //could call parameters here whatever you want
        //prints false

        print(fish, dog, ((first, second) -> first.canSwim() && second.canSwim()));  //prints true


        //USING PREDICATE AND LAMBDA TO REMOVE ELEMENT ONE AT A TIME W/O A FOR LOOP
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Anthony");
        names.add("Jimmy");
        names.add("Timmy");

        System.out.println("names= " + names);

        names.removeIf(name -> name.charAt(0) == 'J'); //removes all names that start with char 'J' (letter J)

        names.removeIf((String str) -> {
            return str.charAt(0) == 'J';
        }
        ); //same as above, on line 94, but includes parameter type. could write on one line without {} and return
                                                        //don't have to use the word name as param, could use anything
        System.out.println("after filter name= " + names);


    }

    private static void print(Animal first, Animal second, AnotherCheck check) {
        System.out.println(check.check(first, second));
    }

    private static void print(List<Animal> animals, CheckAnimal filter) {
        for (Animal animal : animals) {
            if (filter.check(animal)) {
                System.out.println(animal.getType());  //prints rabbit and dog bc only these can jump, returning true here
            }
        }
        System.out.println();
    }

    //USING PREDICATE  ---> gets same results printed as the method above
//    private static void print(List<Animal> animals, Predicate<Animal> filter) { //can put any type of param in the <>, including String
//        for (Animal animal : animals) {
//            if (filter.test(animal)) {
//                System.out.println(animal.getType());
//            }
//        }
//        System.out.println();
//    }


}

