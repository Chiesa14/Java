package studing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class study1 {
    public static void main(String[] args) {


        /*
        ArrayList
         */
        ArrayList<String> values = new ArrayList<String>();
        values.add("x");
        ArrayList<String> otherValues = new ArrayList<String>();
        otherValues.add("y");
        values.addAll(otherValues);
        String y = (String) values.get(1);

        /*
         java.util.HashSet
         */

        HashSet<String> districts = new HashSet<String>();
        districts.add("Gasabo");
        districts.add("Gasabo");
        districts.add("Bugesera");
        districts.add("Kicukiro");
        districts.add("Rubavu");
        districts.add("Kicukiro");

        for (Object obj : districts) {
            System.out.println(obj);
        }

        Book b1 = new Book("Hamlet", "Shakespeare");
        Book b2 = new Book("The Hobbit", "J.R. Tolkien");
        Book b3 = new Book("Hamlet", "Shakespeare");
        Book b4 = new Book("amlet", "Shakespeare");
        Book b6 = new Book("Hmlet", "Shaespare");

        System.out.println("B1 equals B2: " + b1.equals(b2));
        System.out.println("B1 equals B3: " + b1.equals(b3));

        HashSet set = new HashSet();
        set.add(b1);
        set.add(b2);
        set.add(b3);
        System.out.println("Set size: " + set.size());

        System.out.println("B1: " + b1.hashCode());
        System.out.println("B3: " + b3.hashCode());

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b6);

        System.out.println(books.size());
        Collections.sort(books);
        for (Book st : books){
            System.out.println(st.getTitle() + " " + st.getAuthor());
        }
    }
}
