package rw.ac.rca;

public class HelloWorld {
    public static String details(String country, String firstname){
        return firstname + " From " + country;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(details("Rwanda", "Mike"));

        int [] numbers= {10,20,30,40,50};
        for (int num:numbers) {
            System.out.println(num);
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at i = " + i + " is " + numbers[i]);
        }
    }
}