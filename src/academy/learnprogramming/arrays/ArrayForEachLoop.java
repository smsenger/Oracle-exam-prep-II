package academy.learnprogramming.arrays;

public class ArrayForEachLoop {

    public static void arrayForEachLoop(String[] args) {
        String[] names = {"Jimmy" ,"John", "Tom", "Anthony"};

        //regular for loop:
        for(int i = 0; i < names.length; i++) {
            System.out.println("names: " + names[i]);
        }

        //FOR EACH LOOP/ENHANCED FOR LOOP
        for(String name: names) { //name is a local variable, on in scope in for each loop
                                  //can't modify this local variable, eg: name = name + " " + name
            System.out.println("names: " + name); //no need for index, creation of i variable, end and beg predetermined
        }

        //CAN CHANGE CONTENTS OF ARRAY OBJECT
        StringBuilder[] builders = {
                new StringBuilder("For"),
                new StringBuilder("Loop")
        };

        for(StringBuilder builder: builders) {
            System.out.println(builder);        //JUST PRINTS OUT ORIGINAL ARRAY ELEMENTS
        }

        for(StringBuilder builder: builders) { //THIS WILL ADD "123" TO ARRAY
            builder.append("123");              //use of method to modify array object
            System.out.println(builder);
        }

        ///////////////tricks on exam:
        String pets = "parrot"; //this is not an array
//        for(String pet: pets) { //this will not compile: not an array
//            //body
//        }

        //for(int name: names) {} //can't use int here because names is a STRING ARRAY

        for(char c : pets.toCharArray()) { //can convert characters in a string into array with toCharArray()
            System.out.println(c);          //will print each letter of "parrot" on separate line
        }

//////////////////////////////////
        //enhanced for loop can be used in all kinds of looping and conditional constructs
        //can be used w/i a regular for loop
        //can be used w/i a while loop
        //can be used w/i a do while loop
        //can be used in a switch construct


    }
}
