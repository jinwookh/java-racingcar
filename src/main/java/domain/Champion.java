package domain;

import java.util.*;

public class Champion {
    List<Car> champions;

    Champion(List<Car> cars) {


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
        return positionList.get(0);
    }





}
