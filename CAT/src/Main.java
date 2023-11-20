import java.io.*;

public class Main {
    static void check(int seats) throws SeatNumberException {
        if (seats > 100)
            throw new SeatNumberException("The number of seats is greater than 100");
    }

    public static void main(String[] args) throws Exception {
        Car[] car = new Car[2];
        car[0] = new Benz("red", 20);
        car[1] = new Toyota("green", 30, 200, 500);
        try {
            FileOutputStream file = new FileOutputStream("out.ser");
            ObjectOutputStream out = new ObjectOutputStream(file);
            for (Car value : car) {
                check(value.getNumberOfSeats());

            }
            out.writeObject(car);
            out.close();
            file.close();
        } catch (SeatNumberException e) {
            System.out.println(e);
        }

        try {
            FileInputStream file = new FileInputStream("out.ser");
            ObjectInputStream in = new ObjectInputStream(file);
            for (Car value : car) {
                check(value.getNumberOfSeats());
            }
            car = (Car[]) in.readObject();
            in.close();
            file.close();
            for (Car value : car) {
                System.out.println(value);
            }
        } catch (SeatNumberException e) {
            System.out.println(e);
        }
    }
}