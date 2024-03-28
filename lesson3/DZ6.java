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
        System.out.println("idea");
        System.out.println("git");
        System.out.println("java");
        String progekt = scanner.nextLine();
        switch (progekt.toLowerCase()) {
            case("idea"):
            case ("git"):
            case ("java"):
                System.out.println("Яка у вас OC?");
            case ("Linux"):
            case ("macOS"):
            case ("windows"):
                String scannerFromLine = scanner.nextLine();
                if (scannerFromLine.equals("intelliJ IDEA")) ;
                else if (scannerFromLine.equals("linux")) {
                    System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=windows");}

                 if (scannerFromLine.equals("macOS")) {
                System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=windows"); }

                 if (scannerFromLine.equals("windows")) {
                    System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=windows"); }









            }



        }
    }
