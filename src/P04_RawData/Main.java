package P04_RawData;

import T6_DefiningClasses.P02_Constructors.Car;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int line=Integer.parseInt(scanner.nextLine());
        Map<String,List<Car>> carsInCatalog=new HashMap<>();
        carsInCatalog.put("fragile",new ArrayList<>());
        carsInCatalog.put("flamable",new ArrayList<>());
             while(line -->0){
                 String[]token=scanner.nextLine().split("\\s+");
                 int engineSpeed=Integer.parseInt(token[1]);
                 int enginePower=Integer.parseInt(token[2]);
                 int cargoWeight=Integer.parseInt(token[3]);
                 String cargoType=token[4];
                 double tireOnePressure=Double.parseDouble(token[5]);
                 int tireOneAge=Integer.parseInt(token[6]);
                 double tireTwoPressure=Double.parseDouble(token[7]);
                 int tireTwoAge=Integer.parseInt(token[8]);
                 double tireThreePressure=Double.parseDouble(token[9]);
                 int tireThreeAge=Integer.parseInt(token[10]);


             }

    }
}
