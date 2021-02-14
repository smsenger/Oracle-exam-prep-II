package academy.learnprogramming.classdesign;

public class DataEncapsulation {

    public static void dataEncaps() {
        Company company = new Company();
        company.setName("MyCompany");  //when data member private can't access these properties
        company.addEmployee("John");
        company.addEmployee("Anthony");
        company.addEmployee(null); //null pointer exception on printSorted() on line 12
                                        //with revised addEmployee method null won't be added, will print message

        company.printSorted();  //prints as expected

//        company.name = null;
//        company.printSorted();  //company name is null, prints sorted employees

//        company.employees = null;

//        company.employees.add("Jimmy"); //add() produces null pointer exception when not commented out
//        company.printSorted(); //printSorted() produces null pointer exception when line 18 commented out
                                //can't sort a null list
    }
}
