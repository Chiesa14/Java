package rw.ac.rca.abs;

class Circle extends  Shape{
    private double radius;
    public Circle(String color,double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + super.color + '\'' +
                '}';
    }
}
