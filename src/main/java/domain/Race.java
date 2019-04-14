package domain;

import java.util.List;

public class Race {
    private static final int TOP = 9;
    private static final int BOTTOM = 1;
    private static final int BOUNDARY = 4;

    public static int getRandomNumber() {
        int randomNumber = (int)(Math.random() * (TOP -  BOTTOM ) + BOTTOM);

        return randomNumber;
    }

    private static boolean go(int randomNumber) {
        if (randomNumber >= BOUNDARY) {
            return true;
        }
        return false;
    }

    public static void doRace(List<Car> cars) {
        for ( Car car : cars
             ) {
            if(go(getRandomNumber())) {
                car.move();
            }
        }
    }


}
