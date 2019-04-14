import domain.CarNames;

public class Solution {
    public static void main(String[] args) {

        CarNames carNames = new CarNames("car1,car2,,,car5");
        System.out.println(carNames.toString());
    }
}
