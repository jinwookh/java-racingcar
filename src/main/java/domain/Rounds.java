package domain;

import java.util.List;

public class Rounds {
    private static String RESULT_IS = "실행 결과";

    private int number;

    public Rounds(String input) {
        input = input.trim();
        if(checkValidity(input) == false) {
            throw new IllegalArgumentException();
        }
        number = Integer.parseInt(input);
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
    }


}
