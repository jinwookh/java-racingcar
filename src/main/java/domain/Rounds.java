package domain;

public class Rounds {
    private int number;

    public Rounds(String input) {
        input = input.trim();
        if(checkValidity(input) == false) {
            throw new IllegalArgumentException();
        }
        number = Integer.parseInt(input);
    }


    private boolean checkValidity(String input) {
        int rounds = Integer.parseInt(input);
        return rounds > 0;
    }
}
