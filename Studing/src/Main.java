import javax.swing.text.Document;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner reader = new Scanner(new BufferedReader(new FileReader("input.txt")));
            reader.useDelimiter("[,\n]");

            while (reader.hasNextLine()) {
                int districtCode = reader.nextInt();
                String districtName = reader.next();
                int provinceCode = reader.nextInt();
                String provinceName = reader.next();
                System.out.println("District Code: " + districtCode + ", province Code: " + provinceCode + ", Province Name: " + provinceName + ", District Name: " + districtName);
                List<Object> list = new ArrayList<>();
                list.add(districtCode);
                list.add(districtName);
                list.add(provinceCode);
                list.add(provinceName);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("There was an error" + e.getMessage());
        }
    }
}