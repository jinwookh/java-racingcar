package domain;

import java.util.List;

public class CarNames {
    static final String SEPARATOR = ",";

    private List<String> names;


    public CarNames(String input) {
        int count =  countValidNames(input);

        if ( count == 0 ) {
            throw new IllegalArgumentException("쉼표로 구분된 차 이름들을 입력해 주세요. " +
                    "차 이름은 영문 또는 숫자 혼합이어야 합니다.");
        }


    }

    int countValidNames(String input) {
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
}
