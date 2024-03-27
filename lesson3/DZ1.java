package lesson3;

import java.util.Scanner;

public class DZ1

// У вас есть строка "Я тестирую замечательно.
// Что еще нужно?", которую нужно ввести с клавиатуры в консоль.
// Необходимо при помощи только  метода next() класса Scanner
// (не используем метод nextLine()) присвоить перемнным типа String следующие значения:
// string1 = Я
// string2 = тестирую
// string3 = замечательно
// string4 = Что еще нужно?
// Помимо string1, string2, string3, string4 новых переменных
// создавать нельзя.

   {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.println("Я тестирую замечательно. Что еще нужно?");
           String text = scanner.next();
           System.out.println(text);
           System.out.println(scanner.next());
           System.out.println(scanner.next());
           System.out.println(scanner.nextLine().trim());
           scanner.close();







       }
}
