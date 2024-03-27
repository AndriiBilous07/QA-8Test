package lesson3;

import java.util.Scanner;

public class DZ4 // (Использовать операторы if-else-if)
// Пользоватьель вводит с клавиатуры числа:
// Если число равно 1, то выводин на консоль "Понедельник";
// Если число равно 2, то выводин на консоль "Вторник";
// Если число равно 3, то выводин на консоль "Среда";
// Если число равно 4, то выводин на консоль "Четверг";
// Если число равно 5, то выводин на консоль "Пятница";
// Если число равно 6, то выводин на консоль "Суббота";
// Если число равно 7, то выводин на консоль "Воскресенье";
// В противном случае выводим текст: "Лучше бы сегодня была пятница".

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Який сьогодні день?");
        String tudeyitsday = scanner.nextLine();
        if (tudeyitsday.equals("1")){
            System.out.println("Понеділок");
        } else if (tudeyitsday.equals("2")){
            System.out.println("Вівторок");
        } else if (tudeyitsday.equals("3")){
            System.out.println("Середа");
        } else if (tudeyitsday.equals("4")){
            System.out.println("Четвер");
        } else if (tudeyitsday.equals("5")){
            System.out.println("Пятниця");
        } else if (tudeyitsday.equals("6")){
            System.out.println("Субота");
        } else if (tudeyitsday.equals("7")){
            System.out.println("Неділя");
        } else {
            System.out.println("Лучше бы сегодня была пятница");
        }

}
}

