package academy.learnprogramming.arrays;

public class MultidimensionalArrays {

    public static void multidimensionalArrays(String[] args) {
        //1D array
        int[] myArray = new int[]{0, 1};

        //assymetical 2D array
        int[][] array = new int[2][4]; //2 rows and 4 columns
        int anotherArray[][] = new int[2][4]; //same as above
        int[] myIntArray[] = new int[2][4]; //this will also compile

        String[][] my2dArray = new String[][]{
                {"One", "Two"}, //1st row, 2 columns
                {"Three", "Four", "Five"}, //2nd row, 3 columns
                {"Six", "Seven", "Eight", "Nine"}, //3rd row, 4 columns
                null
        };


        //symmetrical 2d array
        int[][] numberTable = new int[2][3];  //asymmetrical array defined
        numberTable[0][0] = 1;                //symmetrical array created with assignment
        numberTable[0][1] = 2;
        numberTable[0][2] = 3;
        //numberTable[0][3] = 4; this is out of bounds


        //3D array
        //pages/planes: rows, columns
        int[][][] threeArray = new int[3][3][3]; //3 by 3 cube
        int oneMore[][][] = new int[3][3][3];//also valid, same dimensions
        int[] anotherThreeArray[][] = new int[3][3][3];//also valid

        //assign values to 3D array
        int[][][] final3DArray = new int[3][3][3];
        final3DArray[0][0][0] = 1; //page, row, column are all 1

        //initialize kind of like 2D array
        int[][][] threeDArray = {
                {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, //each row here is 1 plane/side, goes row by row for each side
                {{10, 11, 12}, {13, 14, 15}, {16, 187, 18}},  //2nd side
                {{19, 20, 21}, {22, 23, 24}, {25, 26, 27}},  //3rd and final side of cube
        };

        int[][]array1 = {{1, 2, 3}, {}, {1, 2, 3, 4, 5}}; //this is valid for 2D array bc middle array is 0
    }
}
