public class FamilyTies {
    public void ties (Human human) {
        if (human.getParents()[0] != null && human.getParents()[1] != null){
            System.out.println();
            System.out.println("<><><><><ПАПА><><><><>");
            System.out.println(human.getParents()[0].getAllInfo());
            System.out.println();
            System.out.println("<><><><><МАМА><><><><>");
            System.out.println(human.getParents()[1].getAllInfo());
        }
        if (!human.getChildren().isEmpty()){
            System.out.println();
            System.out.println("<><><><><ДЕТИ><><><><>");
            for (Human h : human.getChildren()){
                System.out.println(h.getAllInfo());
            }
        }
        new Menu().menu();
    }
}
