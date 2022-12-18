import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Menu {
    public void hello_menu (){
        System.out.println("====================############=======================");
        System.out.println("               Генеалогическое древо              ");
        menu();
    }

    public void menu (){
        System.out.println("====================############=======================");
        System.out.println("                 Список всех людей                     ");
        HashSet<Human> allHumans = new HumanInit().init();
        Map<Integer, Human> allPeople = new HashMap<>();
        int index = 1;
        for (Human h : allHumans) {
            allPeople.put(index, h);
            index++;
        }
        for (Map.Entry<Integer, Human> s : allPeople.entrySet()) {
            System.out.printf("%s. %s %s\n", s.getKey(), s.getValue().getFirstName(), s.getValue().getLastName());
        }
        System.out.println("====================############=======================");
        System.out.println("       Введите цифру соответствующую человеку,         ");
        System.out.println("    а я выведу его родителей, и детей если они есть    ");
        System.out.println("    или введите 0 для завершения работы приложения:    ");
        boolean flag = false;
        while (!flag){
            int change = new KeyboardInput().input(allPeople);
            if (change == 0) {
                flag = true;
                System.out.println("--------------------------");
                System.out.println("Завершаю работу приложения");
                System.out.println("--------------------------");
            }
            else {
                if (change != -1) {
                    flag = true;
                    new FamilyTies().ties(allPeople.get(change));
                }
            }
        }
    }
}
