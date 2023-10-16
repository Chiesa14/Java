package rw.ac.rca.intfc;

public class Rectangle implements Example{
    private  double width;
    private double length;
    public  Rectangle(){}
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    @Override
    public double area() {
        return width * length;
    }

    @Override
    public String myString() {
        return "I am a rectangle with color" + Shape.color + " are is " + this.area();
    }

    @Override
    public String print() {
        return null;
    }

    @Override
    public void myCustomMethod() {

    }
}
