package academy.learnprogramming.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {

    public static void sortingList(String[] args) {
        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("9");
        numsList.add("50");
        numsList.add("40");

        System.out.println(numsList);//prints in order of insertion

        //sort this ArrayList
        //Collections class utilities
        Collections.sort(numsList);
        System.out.println(numsList);//these are strings, sorted alphabetically
                                    //[10, 40, 50, 500, 9]

        List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);//fixed size list
        System.out.println(numbers);

        Collections.sort(numbers);
        System.out.println(numbers); //prints numbers sorted by size in []
    }
}
