import domain.*;

import java.util.List;

import java.util.List;

public class Solution {
    public static void main(String[] args) {
        CarNames carNames = InputHandler.getCarNames();
        Rounds rounds = InputHandler.getRounds();
        List<Car> cars = carNames.generateCarsWithCarNames();
        rounds.start(cars);

        System.out.println(Champion.getPositionSet(cars));

    }
}
