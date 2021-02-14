package academy.learnprogramming.strings;

public class StringEquality {

    public static void stringEquality(String[] args) {
        String name = "John";
        String anotherName = "John";
        String john = "Jo" + "hn";//same as writing "john"
        String newName = new String("John");

        System.out.println("name== anotherName --> " + (name == anotherName));//true
        System.out.println("name== john --> " + (name == john));//true
        System.out.println("name== newName --> " + (name == newName));//false

        System.out.println("name.equals(anotherName) " + name.equals(anotherName));//true
        System.out.println("name.equals(john) " + name.equals(john));//true
        System.out.println("name.equals(newName) " + name.equals(newName));//true


        //prints memory location
        System.out.println("name - identityHashCode ->" + System.identityHashCode(name));//same
        System.out.println("anotherName - identityHashCode ->" + System.identityHashCode(anotherName));//same
        System.out.println("john - identityHashCode ->" + System.identityHashCode(john));//same
        System.out.println("newName - identityHashCode ->" + System.identityHashCode(newName));//different

        String str1 = "abc";
        String str2 = "ab";
        String str3 = str2 + "c";
        //String str2 = "ab" + "c";  ---> this is equal to str1

        System.out.println(str1 == str2);//obviously false
        System.out.println(str1 == str3);//a NEW string, event if contents are in pool with str1 --> false

        System.out.println(System.identityHashCode(str1));//same as commented out str3
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));//commented out version same as str3  --> in this case all three have different identity hash code

    }
}
