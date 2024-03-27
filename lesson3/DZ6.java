package lesson3;

import java.util.Scanner;

public class DZ6 //Используя оператор switch написать программу,
// которая выводит на консоль ссылку для скачивания программы.
// Из выбора программ взять: IntelliJ IDEA, Git, Java. Из выбора ОС взять:
// Linux, macOS, Windows.
// Программа должна спросить пользователя какая программа ему интересна,
// также спросить какую ОС он использует,
// а после вывести в консоль необходимую ссылку.
// Если программа с таким названием не существует выводит сообщение в консоль,
// о том что такой программы не существует. Если указанной пользователем ОС нет,
// то выводится сообщение в консоль, о том что такой ОС не существует.

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Яка програма вас цікавить?");
        System.out.println("intelliJ IDEA");
        System.out.println("git");
        System.out.println("java");
        String progekt = scanner.nextLine();
        switch (progekt.toLowerCase()) {
            case("intelliJ IDEA"):
            case ("git"):
            case ("java"):
            default:
                System.out.println("такой программы не существует!!!");
                System.out.println("Яка у вас OC?");
                System.out.println("Linux");
                System.out.println("macOS");
                System.out.println("Windows");
            String result = scanner.nextLine();
            switch (result){
                case ("Linux"):
                case ("macOs"):
                case ("Windows"):
                default:
                    System.out.println("такой ОС не существует!!!");

            }



        }
    }
}