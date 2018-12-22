package arraylist;

/**
 * Created by nadimchouglay on 20/04/2018.
 */
public class Vehicle {
    String make;
    String model;
    boolean drive;
    int price;

    public Vehicle(String make, String model, boolean drive, int price) {
        this.make = make;
        this.model = model;
        this.drive = drive;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isDrive() {
        return drive;
    }

    public void setDrive(boolean drive) {
        this.drive = drive;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", drive=" + drive +
                ", price=" + price +
                '}';
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
