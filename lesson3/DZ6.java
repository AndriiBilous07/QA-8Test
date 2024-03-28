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
            case ("idea"):
                System.out.println("Яка у вас OC?");
            case ("linux"):
            case ("macOS"):
            case ("windows"):
                String scannerFromLine = scanner.nextLine();
                if (scannerFromLine.equals("idea")) ;
                else if (scannerFromLine.equals("linux")) {
                    System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=windows");
                }

                if (scannerFromLine.equals("macOS")) {
                    System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=windows");
                }

                if (scannerFromLine.equals("windows")) {
                    System.out.println("https://www.jetbrains.com/ru-ru/idea/download/?section=windows");
                }
                break;

            case ("git"):
                System.out.println("Яка у вас OC?");
                String scannerFromLine1 = scanner.nextLine();
                if (scannerFromLine1.equals("git")) ;
                else if (scannerFromLine1.equals("linux")) {
                    System.out.println("https://git-scm.com/downloads");
                }

                if (scannerFromLine1.equals("macOS")) {
                    System.out.println("https://git-scm.com/downloads");
                }

                if (scannerFromLine1.equals("windows")) {
                    System.out.println("https://git-scm.com/downloads");
                }
                break;
            case ("java"):
                System.out.println("Яка у вас OC?");
                String scannerFromLine0 = scanner.nextLine();
                if (scannerFromLine0.equals("java")) ;
                else if (scannerFromLine0.equals("linux")) {
                    System.out.println("https://www.oracle.com/cis/java/technologies/downloads/");
                }

                if (scannerFromLine0.equals("macOS")) {
                    System.out.println("https://www.oracle.com/cis/java/technologies/downloads/");
                }

                if (scannerFromLine0.equals("windows")) {
                    System.out.println("https://www.oracle.com/cis/java/technologies/downloads/");
                }
                break;
            default:
                System.out.println("такої програми не існує");
                break;











            }



        }
    }
