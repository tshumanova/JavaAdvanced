package T6_DefiningClasses.P02_Constructors;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Car> cars = new LinkedHashSet<>();
        int lineNumber = Integer.parseInt(scanner.nextLine());
        while (lineNumber-- > 0) {
            String[] token = scanner.nextLine().split("\\s+");
            Car car = token.length == 1 ? new Car(token[0]) : new Car(token[0], token[1], Integer.parseInt(token[2]));
            cars.add(car);
        }
        cars.forEach((car -> System.out.println(car.carInfo())));

    }
}
