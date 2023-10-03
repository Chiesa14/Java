package rw.ac.rca.mis;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public  static  void  main(String[] args){
        String string = "2005-02-12";
        LocalDate dob = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);
        Person peter = new Person(12,"Mugisha","Davis",dob);
        System.out.println(peter);
    }
}