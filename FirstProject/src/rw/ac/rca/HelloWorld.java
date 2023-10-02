package rw.ac.rca;

public class HelloWorld {
    public static String details(String country, String firstname){
        return firstname + " From " + country;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(details("Rwanda", "Mike"));
    }
}