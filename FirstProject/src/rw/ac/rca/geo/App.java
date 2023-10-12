package rw.ac.rca.geo;
public class App {
    public  static  void main(String[] args){
        int dima = 11;
        int dimb= 24;

        Shape triangle = new Triangle(dima, dimb);
        triangle.area();

        Shape rectangle = new Rectangle(dima, dimb);
        rectangle.area();

        Shape square = new Square(dima, dimb);
        square.area();
    }
}
