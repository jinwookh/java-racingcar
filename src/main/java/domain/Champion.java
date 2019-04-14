package domain;

import java.util.*;

public class Champion {
    static final String SEPERATOR = ",";
    static final String ARE_WINNERS = "가 최종 우승했습니다.";
    List<Car> champions;

    public Champion(List<Car> cars) {
        champions = getChampion(cars);

    }

    private List<Car> getChampion(List<Car> cars) {
        List<Car> champions = new ArrayList<>();
        int championPosition = getMaxFromPositionList(getPositionList(cars));
        for (Car car : cars
             ) {
            if(car.positionIs() == championPosition) {
                champions.add(car);
            }
        }
        return champions;
    }


    public static List<Integer> getPositionList(List<Car> cars) {
        List<Integer> positionList = new ArrayList<>();
        for (Car car : cars
             ) {
            positionList.add(car.positionIs());
        }
        return positionList;
    }


    public static int getMaxFromPositionList(List<Integer> positionList) {
        if (positionList.size() == 0) {
            throw new IllegalStateException("There need to be at least 1 element" +
                    " in position set.");
        }
        Collections.sort(positionList);
        return positionList.get(positionList.size() - 1);
    }

    @Override
    public String toString() {
        String championString = "";
        int i;
        for(i = 0; i < champions.size() - 1; i++) {
            championString += champions.get(i).toString() + SEPERATOR;
        }

        championString += champions.get(i);

        return championString + ARE_WINNERS;
    }
}
