package domain;

import java.util.*;

public class Champion {
    List<Car> champions;

    public Champion(List<Car> cars) {
        champions = getChampion(cars);
        for (Car car: champions
             ) {
            System.out.println(car);
        }

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





}
