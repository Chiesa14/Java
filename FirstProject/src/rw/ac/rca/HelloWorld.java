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
        long num = 5;
        int number = (int)num;
        short n = (short)number;
        System.out.println("Short " + num);
        System.out.println("Int " + number);
        System.out.println("Long " + n);

//equality of objects
        String s1= "Hello";
        String s2 = "World";
        s1= new String("Hello");
        s2= new String("Hello");
        String s3= s2;
        if (s1.equals(s2)) {
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
        //Encapsulation

        Person p1 = new Person();
        p1.setAge(10);
        p1.setFname("Chiesa");
        System.out.println("My name is "+ p1.getFname() + " I'm " + p1.getAge() + " Old");
    }
}