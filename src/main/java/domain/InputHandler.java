package domain;

import java.util.List;
import java.util.Scanner;

public class InputHandler {
    private static final String ASK_NAMES = "경주할 자동차 이름을 입력하세요." +
            "(이름은 쉽표(,) 기준으로 구분";
    private static final String ASK_ROUNDS = "시도할 횟수는 몇회인가요?";
    private static final String NAMES_ERROR = "쉼표로 구분된 차 이름들을 입력해 주세요. " +
            "차 이름은 영문 또는 숫자 혼합이어야 합니다.";
    private static final String ROUNDS_ERROR = "0 이상의 정수를 입력하셔야 합니다.";

    private static Scanner SCANNER = new Scanner(System.in);

    public static CarNames getCarNames() {
        System.out.println(ASK_NAMES);
        try {
            return new CarNames(SCANNER.nextLine());
        } catch(Exception e) {
            System.out.println(NAMES_ERROR);
            return getCarNames();
        }
    }

    public static Rounds getRounds() {
        System.out.println(ASK_ROUNDS);
        try {
            return new Rounds(SCANNER.nextLine());
        } catch(Exception e) {
            System.out.println(ROUNDS_ERROR);
            return getRounds();
        }
    }

}
