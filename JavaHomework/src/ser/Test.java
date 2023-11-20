package ser;

import java.io.*;
public class Test {
    public static void main(String[] args) {
        Student[] sde = new Student[2];
         sde[0] = new Student(101, "Jack", 15);
         sde[1] = new Student(102, "Jacky", 18);
        String filename = "student.txt";
        try {
            // Saving of object in a file
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            // Method for serialization of object
            // Writing array
            out.writeObject(sde);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        }
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }

        Student[] sts = new Student[2];
        // Deserialization
        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            sts = (Student[]) in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");
            for (Student object3 : sts) {
                System.out.println("Code= " + object3.code);
                System.out.println("Name = " + object3.firstName);
                System.out.println("Age = " + object3.age);
                System.out.println();
            }
        }
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}
