package academy.learnprogramming.arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SearchingList {

    public static void searchingList(String[] args) {
        List<String> numsList = new ArrayList<>();
        numsList.add("500");
        numsList.add("10");
        numsList.add("50");
        numsList.add("40");

        System.out.println(numsList);

        int index = Collections.binarySearch(numsList, "10");
        System.out.println(index);//prints -1 --> like array, when not sorted results are unpredictable/undefined w/binary search

        Collections.sort(numsList);
        System.out.println(numsList);//[10, 40, 50, 500, 9]
        index = Collections.binarySearch(numsList, "10");
        System.out.println(index);//prints 0

        List<Integer> numbers = Arrays.asList(5, 4, 8, 10, 11, 7, 3);
        System.out.println(numbers);
        index = Collections.binarySearch(numbers, 7);//unsorted the result is negative

        Collections.sort(numbers);
        System.out.println(numbers);//[3, 4, 5, 7, 8, 10, 11]

        index = Collections.binarySearch(numbers, 7);//the Integer 7 is at index 3
        System.out.println(index);

    }
}
