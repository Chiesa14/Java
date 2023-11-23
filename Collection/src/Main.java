import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyPoint<Integer,Integer> p = new MyPoint<Integer,Integer>(12,15);
        System.out.println(p);
        MyPoint<Double,Double> d = new MyPoint<Double,Double>(12.5,15.8);
        System.out.println(d);
        d.doSomething(new ArrayList<Double>(Arrays.asList(12.5,43.7,35.2,34.6,56.8)));
        List<MyPoint>points = new ArrayList<MyPoint>();
        points.add(new MyPoint<Double,Float>(12.3,12.0f));
        points.add(new MyPoint<Float,Float>(12.6f,15.6f));
        points.add(new MyPoint<Integer,Integer>(12,15));
        points.add(d);

        System.out.println(points);
    }
}
