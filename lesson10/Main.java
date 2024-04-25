package lesson10;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("dog", "Rock", 5, 75, new String[]{"eat", "drink", "sleep"});
        System.out.println(pet);
        Human human = new Human("Michael", "Karleone", 1977, 90);
        human.setMother(new Human("Jane", "Karleone", 1950, 85));
        human.setFather(new Human("Vito", "Karleone", 1945, 95));
        human.setPet(pet);
        System.out.println(human);
    }

}




