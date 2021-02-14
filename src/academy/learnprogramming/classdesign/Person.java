package academy.learnprogramming.classdesign;

public class Person {

    private String firstName;
    private String lastName;

    public Person() {
        this("Eric", "Johnson"); //this calls 2nd constructor and assigns these names to a person
    }

    public Person(String firstName, String last) {  //better to have param w/same name as field to keep things consistent
//        this(); //compilation error bc this calls 1st constructor, and 1st calls this -- continues indefinitely, recursive constructor invocation
        this.firstName = firstName;
//        String firstName = "myName"; //this won't work bc local var name same as parameter
        String lastName = "myLast"; //this works bc lastName not a parameter
        lastName = last; //can use this. but not required bc parameter different than property name
                        //bc of line 15 we now refer to a local var, not the private prop on line 6
//        this.lastName = last; //here refers to prop on line 6 because uses this.
    }

    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//        this(); //can't call this() in a regular method, only 1st line in constructor
    }

    public String getFirstName () {
        return firstName; //don't need this. bc no param, so firstName not same as param name
    }

    public String getFullName() {
//        return this.firstName + " " + this.lastName;
        return firstName + lastName; //will always return to the field above bc no param
    }


    public static void person() {

    }
}
