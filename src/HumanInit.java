import java.util.HashSet;

public class HumanInit {
    public HashSet<Human> init() {
        Human h1 = new Human("Семен", "Семенов", 1, 27);
        Human h2 = new Human("Юлия", "Семенова", 2, 25);
        Human h3 = new Human("Сергей", "Петров", 1, 45);
        Human h4 = new Human("Ирина", "Петрова", 2, 48);
        Human h5 = new Human("Виталий", "Семенов", 1, 50);
        Human h6 = new Human("Евгений", "Семенов", 1, 48);
        Human h7 = new Human("Анжелика", "Семенова", 2, 49);
        Human h8 = new Human("Людмила", "Ненашева", 2, 72);
        Human h9 = new Human("Валентина", "Ненашева", 2, 71);
        Human h10 = new Human("Алексей", "Петров", 1, 69);
        Human h11 = new Human("Елена", "Акакьева", 2, 68);
        Human h12 = new Human("Владимир", "Семенов", 1, 72);
        Human h13 = new Human("Елена", "Данмахена", 2, 71);
        Human h14 = new Human("Александра", "Александрова", 2, 95);
        Human h15 = new Human("Виктор", "Ненашев", 1, 94);
        Human h16 = new Human("Дарья", "Планова", 2, 93);
        Human h17 = new Human("Виктор", "Акакьев", 1, 95);
        Human h18 = new Human("Елена", "Дурова", 2, 96);
        Human h19 = new Human("Дмитрий", "Семенов", 1, 99);
        h1.changeParents(h5, h4, h1);
        h2.changeParents(h5, h4, h2);
        h3.changeParents(h10, h9, h3);
        h4.changeParents(h10, h9, h4);
        h5.changeParents(h12, h11, h5);
        h6.changeParents(h12, h11, h6);
        h7.changeParents(h12, h13, h7);
        h8.changeParents(h15, h14, h8);
        h9.changeParents(h15, h14, h9);
        h11.changeParents(h17, h16, h11);
        h12.changeParents(h19, h18, h12);
        HashSet<Human> allHumans = new HashSet<>();
        allHumans.add(h1);
        allHumans.add(h2);
        allHumans.add(h3);
        allHumans.add(h4);
        allHumans.add(h5);
        allHumans.add(h6);
        allHumans.add(h7);
        allHumans.add(h8);
        allHumans.add(h9);
        allHumans.add(h10);
        allHumans.add(h11);
        allHumans.add(h12);
        allHumans.add(h13);
        allHumans.add(h14);
        allHumans.add(h15);
        allHumans.add(h16);
        allHumans.add(h17);
        allHumans.add(h18);
        allHumans.add(h19);
        return allHumans;
    }
}
