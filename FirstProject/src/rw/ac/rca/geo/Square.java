package rw.ac.rca.geo;

public class Square extends  Shape{
    public  Square(int dima,int dimb){
        super(dima, dimb);
    }

    @Override
    public void area() {
        System.out.println("The area of the square is "+ dima*dimb);
    }
}
