public class Benz extends Car implements AirConditioner {
final  int min= 200;
final  int max = 500;

    public Benz(String color, int numberOfSeats) {
        super(color, numberOfSeats);
        super.max_height = max;
        super.min_height = min;
    }

    @Override
    public void manageTemperature() {

    }

    @Override
    public String toString() {
        return "Benz{" +
                ", color='" + color + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", min_height=" + min_height +
                ", max_height=" + max_height +
                '}';
    }
}
