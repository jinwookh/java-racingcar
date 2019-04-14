import domain.Car;
import domain.CarNames;
import domain.Rounds;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        CarNames carNames = new CarNames("car1,car2,,,car5");
        List<Car> cars = carNames.generateCarsWithCarNames();
        for (Car car :  cars
             ) {
            System.out.println(car);
        }
        Rounds rounds = new Rounds("0");

    }
}
