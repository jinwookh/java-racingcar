package domain;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Champion {
    List<Car> champions;

    Champion(List<Car> cars) {


    }


    public static Set<Integer> getPositionSet(List<Car> cars) {
        Set<Integer> positionSet = new HashSet<>();
        for (Car car : cars
             ) {
            positionSet.add(car.positionIs());
        }
        return positionSet;
    }





}
