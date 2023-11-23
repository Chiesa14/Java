import java.util.ArrayList;

public class MyPoint<T, R> {
    private T x;
    private R y;

    @Override
    public String toString() {
        return "MyPoint [" + "x=" + x + ", y=" + y + ']';
    }


    public MyPoint(T x, R y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public R getY() {
        return y;
    }

    public void setY(R y) {
        this.y = y;
    }

    public void doSomething(ArrayList<T> ari) {
        for (Object i : ari) {
            System.out.println(i);
        }
    }
}
