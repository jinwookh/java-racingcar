package domain;

public class Rounds {
    private int rounds;

    Rounds(String input) {
        if(checkValidity(input) == false) {
            throw new IllegalArgumentException();
        }
        rounds = Integer.parseInt(input);
    }


    private boolean checkValidity(String input) {
        int rounds = Integer.parseInt(input);
        return rounds > 0;
    }
}
