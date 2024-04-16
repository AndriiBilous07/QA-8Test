package lesson9.Tree;

public class TreeClasDz {
    public static void main(String[] args) {
        Tree tree1 = new Tree("Сосна", 250);
        Tree tree2 = new Tree(300, 20, "Зелений");
        Tree tree3 = new Tree();
        Tree tree4 = new Tree("Дуб");

        System.out.println(tree1);
        System.out.println(tree2);
        System.out.println(tree3);
        System.out.println(tree4);
    }
}


