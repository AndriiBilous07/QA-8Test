package lesson8;

public class MetodDz1 {
    public static void main(String[] args) {
        Metod a = new Metod();
        int[] qwerty = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        System.out.println(" " + qwerty.length);
        System.out.println("парне число");
        for (int num : qwerty) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
            }
        }
        System.out.println(" " + qwerty.length);
        System.out.println("не парне число");
        for (int num : qwerty) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

    }
}
