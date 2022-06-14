package T6_DefiningClasses.P02_Constructors;

public class Car {
    private final String brand;
    private String model = "unknown";
    private int horsePower = -1;

    public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String brand, double tireOnePressure, int tireOneAge, double tireTwoPressure, int tireTwoAge, double tireThreePressure, int tireThreeAge, double tireFourPressure, int tireFourAge){
        this.brand=brand;
    }
    public Car(String brand,String model,int horsePower) {
        this(model, engineSpeed, enginePower, cargoWeight, brand, tireOnePressure, tireOneAge, tireTwoPressure, tireTwoAge, tireThreePressure, tireThreeAge, tireFourPressure, tireFourAge);
        this.model = model;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {

        return model;
    }

    public int getHorsePower() {

        return horsePower;
    }

    public String carInfo() {
        return String.format("The car is: %s %s - %d HP.", this.getBrand(), this.getModel(), this.getHorsePower());
    }
}
