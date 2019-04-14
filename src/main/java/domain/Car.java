package domain;

public class Car {
    private final String name;
    private int position = 0;

    public Car(String name) {

        this.name = name;

    }

    @Override
    public String toString() {
        return name;
    }


    // 추가 기능 구현
}
