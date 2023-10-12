package rw.ac.rca.geo;

public class Shape {
    int dima,dimb;

    public Shape(int dima, int dimb) {
        this.dima = dima;
        this.dimb = dimb;
    }

    public int getDima() {
        return dima;
    }

    public void setDima(int dima) {
        this.dima = dima;
    }

    public int getDimb() {
        return dimb;
    }

    public void setDimb(int dimb) {
        this.dimb = dimb;
    }

    public  void area(){
        System.out.println("I don't have detailed information");
    }
}
