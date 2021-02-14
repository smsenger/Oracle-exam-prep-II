package academy.learnprogramming.classdesign;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Company {

    private String name;
    private List<String> employees = new ArrayList<>();

//    public Company() {};    //not needed because compiler will create empty default constructor

    public void printSorted() {
        System.out.println("companyName = " + name);
        Collections.sort(employees);
        System.out.println("sorted= " + employees);
    }

    public void setName(String name) {      //can access private data using these public methods
        if(name == null) {
            System.out.println("Name can't be null.");
            return;
        }
        this.name = name;
    }

    public String getName() {           //can access private data using these public methods
        return name;
    }

    public void addEmployee(String name) { //employees list can't be accessed by outside world but can be set with this method

        if(name == null || name.isEmpty()) {                  //this deals with someone using null as param for this method
            System.out.println("Can't add null employee.");
//            return;  //can use this or else stmt below
        }
        else {
            employees.add(name);
        }
    }
}
