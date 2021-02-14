package academy.learnprogramming.strings;

public class StringBuilderMethods {

    public static void stringBuilderMethods(String[] args) {
        //charAt, indexOf, length, substring
        StringBuilder sb = new StringBuilder("programming");
        //p r o g r a m m i n g
        //0 1 2 3 4 5 6 7 8 9 10
        String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));//returns a string, from index 3 to 6 inclusive ---> gram
                //if index is same in first and second, will return empty string
        int len = sb.length();//11 characters
        char ch = sb.charAt(5);//a

        System.out.println(sub + " " + len + " " + ch);//gram, 11, a

        //append
        StringBuilder b = new StringBuilder().append(1).append("L");//chaining can take place during declaration
        b.append("-").append(true);
        System.out.println(b);//1L-true

        //insert
        StringBuilder builder = new StringBuilder("programming");
        builder.insert(7, "-");//before index 7, will insert a --> becomes index 7
        builder.insert(2, 2);//will insert 2 before index 2 --> becomes index 2
                //pr2ogram-ming

        //delete, deleteCharAt
        //delete removes characters from sequence at particular index
        //deleteCharAt removes specific characters
        builder.delete(4, 9);//from 4 to index 9, excludes 9, just goes 4-8
        System.out.println();
        builder.deleteCharAt(2);//will delete char at index 2
        System.out.println(builder);

        //builder.delete(2, 1);//can't have start > end, StringBuilderOutOfBoundsException
        builder.delete(1, 1);//changes nothing
        System.out.println(builder);//changed nothing

        //reverse
        StringBuilder sb1 = new StringBuilder("ABC123");
        sb1.reverse();//can chain reverse, returns the same string you start with
        System.out.println(sb1);

        //toString
        String myString = sb1.toString();//turns SB into string
        myString = myString.toLowerCase();
        System.out.println(myString);

    }
}
