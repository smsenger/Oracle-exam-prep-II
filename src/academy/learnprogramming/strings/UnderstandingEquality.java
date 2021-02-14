package academy.learnprogramming.strings;

public class UnderstandingEquality {

    public static void understandingEquality(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("Java");
        //StringBuilder three = one; ===> this would also return as equal, returns same obj reference
        System.out.println(one == two);//use 2 separate builders, different obj references, returns FALSE
        System.out.println(one == three);//returns true bc append returns reference to same string builder obj

        String x = "Java";
        String y = "Java";
        System.out.println(x == y);//true bc strings are immutable and we have to literals, and both in string pool

        String a = "Java";
        String b = " Java".trim();
        System.out.println(a == b);//false because trim method returns a NEW STRING, a and b no longer refer to same string in pool

        String c = "Java";
        String d = " Ja".trim() + "va";
        System.out.println(c == d);//d is new instance of string, not == c, so prints false
    }
}
