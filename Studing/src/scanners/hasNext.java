package scanners;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class hasNext {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("rca.txt")));
        while (scanner.hasNext()) {
//            System.out.println(scanner.next());
            System.out.println(scanner.nextInt());
        }
    }
}
