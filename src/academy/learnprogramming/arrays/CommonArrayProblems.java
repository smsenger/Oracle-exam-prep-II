package academy.learnprogramming.arrays;

public class CommonArrayProblems {

    public static void commonArrayProblems(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        for(int i = 1; i < numbers.length; i++) {
            System.out.println(i + "-" + numbers[i]); //this will start at index 1, skipping first element
        }

        for(int i = 1; i <= numbers.length; i++) {
            System.out.println(i + "-" + numbers[i]); //will cause ArrayIndexOutOfBoundsException bc the length is not the same as index count, length is length - 1
                                                        //index 0-4, count is 5
        }

        //correct version of above "for loop"
        for(int i = 1; i <= numbers.length -1; i++) {
            System.out.println(i + "-" + numbers[i]); //will cause ArrayIndexOutOfBoundsException bc the length is not the same as index count, length is index - 1
            //index 0-4, count is 5
        }

        //can't specify size of array on left side
        //int[20] nums;
        //correct:
        int[] nums = new int[20];//size only at initialization

        /////////////////////////////
        //int size = numbers.length(); //does not compile, length is not a method for arrays
        int size = numbers.length; //this will compile!

       // numbers.length = 10; //will not compile, can only set length at initialization, var is FINAL


    }
}
