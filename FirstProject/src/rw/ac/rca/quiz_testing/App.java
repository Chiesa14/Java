package rw.ac.rca.quiz_testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class App {
    public static void main(String args[]) throws IOException {
            InputStream in = new FileInputStream("input.txt");
            int a = in.read();
    }

}
