package academy.learnprogramming.methods;

public class ReturningDataFromMethods {

    public static void main(String[] args) {
        int number = 2;
        String word = "xyz";

        number(number);//2

        word = word(word); //what is parameter, what is variable, what is method call   //xyza
        System.out.println(number + word);//reflects original value of variable and new value of word, depends on whether method call assigned to variable
    }

    public static int number(int number) {  //method name can be same as parameter name
        number++;
        return number; //this returns the incremented number, but doesn't change value of number above because the method call not assigned to a variable
    }

    public static String word(String word) {
        word += "a";
        return word;//must assign the method to a variable like above for that print statement to reflect return value here
    }
}
