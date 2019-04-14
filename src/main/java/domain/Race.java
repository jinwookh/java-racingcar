package domain;

public class Race {

    public static int getRandomNumber(int bottom, int top, int boundary) {
        int randomNumber = (int)(Math.random() * (top -  bottom ) + bottom);

        return randomNumber;
    }
}
