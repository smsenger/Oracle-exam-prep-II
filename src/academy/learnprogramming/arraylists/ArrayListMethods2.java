package academy.learnprogramming.arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods2 {

    public static void arrayListMethods2(String[] args) {
        List<String> pets = new ArrayList<>();
        System.out.println(pets.isEmpty());//boolean, TRUE
        System.out.println(pets.size());//how many elements in list

        //isEmpty()
        if(pets.isEmpty()) {
            System.out.println("no pets");
        }

        //size()
        if(pets.size() == 0) {
            System.out.println("no pets");
        }

        pets.add("cat");
        System.out.println(pets.isEmpty());//false
        System.out.println(pets.size());//1

        //clear()
        pets.clear();
        System.out.println(pets.isEmpty());//will now be true

        //contains()
        pets.add("dog");
        System.out.println(pets.contains("cat"));//false
        System.out.println(pets.contains("dog"));//true

        //equals()
        List<String> newPets = new ArrayList<>();
        newPets.add("dog");
        System.out.println(pets.equals(newPets));//true: both just have string dog

        newPets.add("cat");
        System.out.println(pets.equals(newPets));//false: newPets has 1 more element than pets

        pets.add(0, "cat");
        System.out.println(pets);
        System.out.println(newPets);
        //size an elements are equal, but order is not equal
        System.out.println(pets.equals(newPets));//false, [cat, dog] vs [dog, cat]

        List<Integer> ages = new ArrayList<>();
        ages.add(Integer.parseInt("5"));
        ages.add(Integer.valueOf("6"));
        ages.add(7);
        ages.add(null);
        for(int age: ages) System.out.println(age);
    }
}
