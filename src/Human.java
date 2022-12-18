import java.util.ArrayList;

public class Human {
    private final String firstName;
    private final String lastName;
    private final int age;
    private String gender;
    private final Human[] parents = new Human[2];
    public ArrayList<Human> children = new ArrayList<>();

    Human(String arg_firstName, String arg_lastName, int arg_gender, int arg_age) {
        this.firstName = arg_firstName;
        this.lastName = arg_lastName;
        switch (arg_gender) {
            case 1 -> this.gender = "Мужской";
            case 2 -> this.gender = "Женский";
        }
        this.age = arg_age;
    }

    /**
     * Функция для задания родственных связей данного человека
     *
     * @param father Отец данного человека
     * @param mother Мать данного человека
     * @param child  Для задания обратной связи (данный человек будет являться ребенком для указанных родителей)
     */
    public void changeParents(Human father, Human mother, Human child) {
        if (father.getGender().equals("Мужской") && mother.getGender().equals("Женский")) {
            this.parents[0] = father;
            this.parents[1] = mother;
            father.changeChildren(child);
            mother.changeChildren(child);
        } else {
            System.out.println("Вы что то напутали с ролями");
        }
    }

    public void changeChildren(Human child) {
        this.children.add(child);
    }

    public String getAllInfo() {
        return String.format("<><><><><><><><><><><>\nИмя: %s\nФамилия: %s\nПол: %s\nВозраст: %s", firstName, lastName, gender, age);
    }

    public String getGender() {
        return gender;
    }

    public ArrayList<Human> getChildren() {
        return this.children;
    }
    public Human[] getParents() {
        return this.parents;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}