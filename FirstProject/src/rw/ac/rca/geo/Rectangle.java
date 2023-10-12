package rw.ac.rca.geo;

public class Rectangle extends  Shape{

    public Rectangle(int dima, int dimb){
        super(dima,dimb);
    }

    @Override
    public void area() {
        System.out.println("The area of the rectangle is  " + dima*dimb);
    }
}
