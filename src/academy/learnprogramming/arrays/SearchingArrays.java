package academy.learnprogramming.arrays;

import java.util.Arrays;

public class SearchingArrays {

    public static void searchingArrays(String[] args) {

        ////sorted array
        int[] numbers = {1, 3, 5, 6, 7};

        System.out.println(Arrays.binarySearch(numbers, 2));//-2, would be inserted before element 2
        System.out.println(Arrays.binarySearch(numbers, 5));//2
        System.out.println(Arrays.binarySearch(numbers, 7));//4
        System.out.println(Arrays.binarySearch(numbers, 1));//0
        System.out.println(Arrays.binarySearch(numbers, 3));//1
        System.out.println(Arrays.binarySearch(numbers, 6));//3
        System.out.println(Arrays.binarySearch(numbers, 4));//-3, where number would be inserted but negative


        //not sorted array
        int[] notSorted = {5, 4, 10, 8, 6};
        System.out.println(Arrays.binarySearch(notSorted, 5));//0, this is correct
        System.out.println(Arrays.binarySearch(notSorted, 8));//-3, this is incorrect, unpredictable bc array not sorted

        ///^^^^if we sort above, get correct answers
    }
}
