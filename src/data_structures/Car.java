package data_structures;

public class Car {

    // TESTING CLASS 
 
    private int year;
    private int speed;
    private String make;

    public Car(int year, int speed, String make) {
        this.year = year;
        this.speed = speed;
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-10s%-10s", year, speed, make);
        // return "Car{" + "year=" + year + ", speed=" + speed + ", make=" + make + '}';
    }
}
