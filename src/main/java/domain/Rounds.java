package domain;

import java.util.List;

public class Rounds {
    private static String RESULT_IS = "\n실행 결과";

    private int rounds;

    public Rounds(String input) {
        input = input.trim();
        if(checkValidity(input) == false) {
            throw new IllegalArgumentException();
        }
        rounds = Integer.parseInt(input);
    }

    public void start(List<Car> cars) {
        System.out.println(RESULT_IS);
        for (int i = 0; i < rounds; i++) {
            Race.start(cars);
            show(cars);
        }
    }


    private boolean checkValidity(String input) {
        int rounds = Integer.parseInt(input);
        return rounds > 0;
    }

    private void show(List<Car> cars) {
        for (Car car : cars
             ) {
            System.out.println(car.postitionToString());
        }
        System.out.println();
    }


}
