package academy.learnprogramming.strings;

public class ExampleStringBuilder {

    public static void stringBuilder(String[] args) {
        String myString = "";
        for(char c = 'a'; c<='z';c++) {
            myString += c; //every iteration this will create a new string object, will print a-z
        }
        System.out.println(myString);//a-z printed

        //avoid creating a new object: StringBuilder class
        //string builder not immutable, create string, then call toString() to create string

        //append
        StringBuilder sb = new StringBuilder();//new instance of SB object
        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(c);//add char to STring builder, reuses string builder w/o creating string each time
        }
        System.out.println(sb);//prints a-z but doesn't create new string everytime, just adds content to StringBuilder

        //equality
        StringBuilder builder = new StringBuilder("start");
        builder.append("-middle"); //doesn't create new string, just changes original StringBuilder
        StringBuilder anotherBuilder = builder.append("-end");//builder and anotherBuilder point to same location in memory, assigning appended version of builder to anotherBuilder
        System.out.println(builder);//this will have start-middle-end too bc builder had -end appended
        System.out.println(anotherBuilder);//this has all three words as a result of 2 appends
        System.out.println(builder == anotherBuilder);//true
        System.out.println(System.identityHashCode(builder));//same number as below
        System.out.println(System.identityHashCode(anotherBuilder));

        //capacity
        StringBuilder myBuilder = new StringBuilder();
        System.out.println("size= " + myBuilder.length());//0
        System.out.println("capacity= " + myBuilder.capacity());//16

        myBuilder = new StringBuilder(100);//100
        System.out.println("size= " + myBuilder.length());//0
        System.out.println("capacity= " + myBuilder.length());//100

        myBuilder.append("mynewtext");
        System.out.println("size= " + myBuilder.length());//9
        System.out.println("capacity= " + myBuilder.length());//100

        //exam example
        StringBuilder a = new StringBuilder("This ");
        StringBuilder b = a.append("Java ");
        b = b.append("is").append(" so ").append("Cool");
        System.out.println(a);//these both print the same, only 1 SB object, all appends return the same object
        System.out.println(b);//assign a object to b var, when append to b it changes a
    }
}
