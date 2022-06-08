package T6_DefiningClasses;

public class Car {
    private String brand;
    private String model;
    private int horsePower;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public String carInfo() {
        return String.format("Tha car is: %s %s - %d HP.", this.getBrand(), this.getModel(),this.getHorsePower());

    }
}
