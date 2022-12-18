import java.util.Map;
import java.util.Scanner;

public class KeyboardInput {
    public int input(Map<Integer, Human> allPeople) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        if (isDigit(input)) {
            int inputDigit = Integer.parseInt(input);
            if (allPeople.containsKey(inputDigit) || inputDigit == 0) {
                return inputDigit;
            } else {
                System.out.println("Нет такого пункта");
                return -1;
            }
        } else {
            System.out.println("Нет такого пункта");
            return -1;
        }
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
