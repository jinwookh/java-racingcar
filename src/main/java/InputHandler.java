import java.util.Scanner;
import java.util.Vector;

public class InputHandler {
    private static final String FIRST_WORD = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String SEPARATOR = ",";
    private static final int MAX = 5;

    static String getInput() {
        Scanner s = new Scanner(System.in);
        System.out.println(FIRST_WORD);
        return s.nextLine();
    }

    static Vector<String> parse(String input, String Separator) {
        Vector<String> names = new Vector<>();
        String[] stringArray;

        stringArray = input.split(Separator);
        for (String string : stringArray
             ) {
            if(string.equals("")==false) {
                names.add(string.trim());
            }
        }

        return names;
    }


    /*
    static int countName(String specificName, Vector<String> names) {
        int count = 0;

        for (String name : names
             ) {
            if(name.equals(specificName)) {
                count++;
            }
        }

        return count;
    }

    static boolean checkRepeatedName(String specificName, Vector<String> names) {
        Boolean repetition = false;
        int count = 0;

        for (String name: names
             ) {
            if(name.equals(specificName)) {
                count++;
            }
            if(count > 1) {
                repetition = true;
                break;
            }
        }

        return repetition;
    }
    */

}
