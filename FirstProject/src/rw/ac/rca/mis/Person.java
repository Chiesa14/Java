package rw.ac.rca.mis;

import java.util.Date;

public class Person {
    private int age;
    private  String firstName;
    private String lastName;
    private Date dob;
    public Person (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public  Person(){}

    public Person(int age, String firstName, String lastName, Date dob) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }
}
