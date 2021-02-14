package academy.learnprogramming.methods;


public class PassingDataBetweenMethods {

    public static void main(String[] args) {
        int number = 4;
        System.out.println("number= " + number);//4
        newNumber(5);
        System.out.println("number= " + number); //44 also, because this prints a copy, didn't set value of original number var to new value

        String name = "Jimmy";
        System.out.println("name = " + name);
        newName(name);                          //okay to use parameter name same as variable name
        System.out.println("name= " + name);    //this prints the original name value

        StringBuilder sb = new StringBuilder();

//        StringBuilder s2 = sb;
//        s2.append("Anthony"); //both s and sb return "Anthony" because both are referencing same object, so the append() affects both Builders

        build(sb);
        System.out.println("StringBuilder = " + sb); //prints Tom because changes made to StringBuilder are available to both references (w/o stringbuilder in build())
                                                    // w/ StringBuilder in build(), prints empty string, s was a copy of sb, but now s is assigned to a different value,
                                                    // and changes to s only affect new StringBuilder s and not sb
    }


    public static void newNumber(int number){
        System.out.println("in newNumber number = " + number); //4
        number = 10;                                            //just setting the parameter, not changing value
        System.out.println("in newNumber number = " + number); //10, just passing parameter value
    }

    public static void newName(String name) {
        System.out.println("in newName name= " + name);
        name = "Timmy";
        System.out.println("in newName name= " + name);//this prints the changed value of parameter
    }

    public static void build(StringBuilder s) {
        s = new StringBuilder();  //now two references point to two different variables/two different objects in memory, the print statement above doesn't print result of append()
                                    //because it applies to the StringBuilder s created here, not sb above
        s.append("Tom");            //prints Tom because method called on parameter, doesn't reassign var to another reference
                                    //changes made to StringBuilder this way are available to both references (here and line 22)
    }
}
