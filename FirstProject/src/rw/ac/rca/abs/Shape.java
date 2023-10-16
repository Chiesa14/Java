package rw.ac.rca.abs;

abstract class Shape {
    protected  String color;

    public Shape(String color) {
        this.color = color;
    }

    public  abstract  double area();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }
}
