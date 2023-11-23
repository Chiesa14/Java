import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> dis = new ArrayList<String>();
        dis.add("Gasabo");
        dis.add("Rubavu");
        dis.add(2, "Bugesera");
        List<String> south = Arrays.asList("Muhanga", "Huye");
        dis.addAll(south);
        List<String> north = new ArrayList<String>();
        north.add("Musanze");
        north.add("Rulindo");
        dis.addAll(3, north);

        for (int i = 0; i < dis.size(); i++) {
            System.out.println(i + "=" + dis.get(i));
        }
        if ((dis.contains("Musanze"))) {
            System.out.println("Musanze has gorillas");
        }
        System.out.println(dis.containsAll(north));
        String s="hello";
        String s1 = "helol";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
    }
}
