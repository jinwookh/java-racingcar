package domain;

public class Car {
    private final String DASH = "-";
    private final String BETWEEN_DASH_AND_NAME = ":";
    private final String name;
    private int position = 0;

    public Car(String name) {

        this.name = name;

    }

    @Override
    public String toString() {
        return name;
    }


    public void move() {
        position++;
    }


    public String postitionToString() {
        String string = name + BETWEEN_DASH_AND_NAME;
        for (int i = 0; i < position; i++ ) {
            string += DASH;
        }
        return string;
    }
    // 추가 기능 구현
}
