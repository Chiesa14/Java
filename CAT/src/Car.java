public class Car implements  java.io.Serializable {
    String color;
    int numberOfSeats;
    int min_height;
    int max_height;

    public Car(String color, int numberOfSeats, int min_height, int max_height) {
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.min_height = min_height;
        this.max_height = max_height;
    }

    public Car(String color, int numberOfSeats) {
        this.color= color;
        this.numberOfSeats= numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getMin_height() {
        return min_height;
    }

    public void setMin_height(int min_height) {
        this.min_height = min_height;
    }

    public int getMax_height() {
        return max_height;
    }

    public void setMax_height(int max_height) {
        this.max_height = max_height;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", min_height=" + min_height +
                ", max_height=" + max_height +
                '}';
    }

}
