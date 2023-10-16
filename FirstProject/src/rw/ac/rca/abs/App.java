package rw.ac.rca.abs;

public class App {
    public  static void main(String[] args){
        Shape rect  = new Rectangle("Red",15.4,30.9);
        System.out.println(rect.toString());
        System.out.println("The area of the rectangle is " + rect.area());
        Shape circle = new Circle("Green",11);
        System.out.println(circle.toString());
        System.out.println("The area of the circle is " + circle.area());
    }
}
