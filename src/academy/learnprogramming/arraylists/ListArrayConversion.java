package academy.learnprogramming.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {

    public static void listArrayConversion(String[] args) {

        //ArrayList to Array
        List<String> names = new ArrayList<>();
        names.add("Tony");
        names.add("Jimmy");
        names.add("Anthony");

        //toArray()
        Object[] namesArray = names.toArray(); //returns an array of objects, not array of strings
        System.out.println(namesArray.length);

        //if add/removes to ArrayList, will not affect array
        //
        String[] stringArray = names.toArray(new String[0]);//toArray will automatically resize the array to hold all names
                                                            //get copy of all elements inside ArrayList to array
        String[] anotherStringArray = names.toArray(new String[names.size()]); //faster to specify size, can use size()

        //Array to List/ArrayList
        String[] petsArray = {"dog", "cat", "parrot"};
        List<String> petsList = Arrays.asList(petsArray);

        List<String> petsList2 = Arrays.asList("dog", "cat", "parrot");//same as above w/1 list, returns fixed size list
        System.out.println(petsList.size());

        petsList.set(0, "bird");//petsArray and petsList connected, this will add bird at 0 for both
        System.out.println(petsList);//adds bird at 0
        System.out.println(Arrays.toString(petsArray));//adds bird at 0

        petsArray[0] = "husky";//changes both array and list
        System.out.println(petsList);
        System.out.println(petsArray);

        //petsList.add("newDog");//won't compile, asList returns a fixed size list, can't add elements
        //petsList.remove(1);//also not supported

        List<String> list = Arrays.asList("one", "two", "three");//this also returns fixed size list, can't add or remove, can only change elements
    }
}
