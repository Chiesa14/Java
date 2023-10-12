package rw.ac.rca.geo;

public class Triangle extends Shape {

    public Triangle (int dima, int dimb){
        super(dima, dimb);
    }

    @Override
    public void area() {
        System.out.println("The area of the triangle is: " +((dima+dimb)/2));
    }
}
