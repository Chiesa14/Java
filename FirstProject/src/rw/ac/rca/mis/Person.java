package rw.ac.rca.mis;


import java.time.LocalDate;

//protected means that it can be shared with another package but access will first be given

public class Person {
    protected int age;
    protected String firstName;
    protected String lastName;
    protected LocalDate dob;



    public Person(String firstName, String lastName) {
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public Person(int age, String firstName, String lastName, LocalDate dob) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }
    public Person(){
        System.out.println("I am a person");
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
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void  myProfile(){
        System.out.println("I am "+ this.firstName);
    }
    public  void myProfile(String title){
        System.out.println("I am "+title+this.firstName+" "+this.lastName);
    }

    public String toString() {
        int years=LocalDate.now().getYear()-this.dob.getYear();
        return this.firstName+" "
                + this.lastName+ "  was born in "+this.dob+
                " and he/she is "+years+ "old";
    }





}