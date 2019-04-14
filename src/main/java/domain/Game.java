package domain;

import java.util.List;

public class Game {

    public static void start() {
        CarNames carNames = InputHandler.getCarNames();
        Rounds rounds = InputHandler.getRounds();
        List<Car> cars = carNames.generateCarsWithCarNames();
        rounds.start(cars);
        Champion champion = new Champion(cars);
        System.out.println(champion);
    }
}
