import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> sti = new LinkedList<Integer>();
        sti.add(100);
        sti.add(200);
        sti.add(300);
        sti.add(400);
        System.out.println("Using Queue");
        for (Integer i : sti) {
            System.out.println(i);
        }
        System.out.println("THe ");
    }
}