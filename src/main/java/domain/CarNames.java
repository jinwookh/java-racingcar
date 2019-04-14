package domain;

import java.util.ArrayList;
import java.util.List;

public class CarNames {
    static final String SEPARATOR = ",";

    private List<String> names;


    public CarNames(String input) {
        int count =  countValidNames(input);

        if ( count == 0 ) {
            throw new IllegalArgumentException();
        }
        this.names = convertInputToNames(input);
    }

    public List<Car> generateCarsWithCarNames() {
        List<Car> cars = new ArrayList<>();
        for (String name : names
             ) {
            cars.add(new Car(name));
        }
        return cars;
    }

    private List<String> convertInputToNames(String input) {
        List<String> names = new ArrayList<>();
        for (String string : input.split(SEPARATOR)) {
            if (checkValidity(string.trim())) {
                names.add(string.trim());
            }
        }

        return names;
    }

    private int countValidNames(String input) {
        int count = 0;
        String[] namesBeforeChecked = input.split(SEPARATOR);

        for (String string : namesBeforeChecked) {
            if (checkValidity(string.trim())) {
                count++;
            }
        }
        return count;
    }


    private boolean checkValidity(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (checkValidity(name.charAt(i)) ==  false) {
                return false;
            }
        }
        return name.length() > 0;
    }

    private boolean checkValidity(char character) {
        if (Character.isAlphabetic(character) || Character.isDigit(character)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return names.toString();
    }
}
