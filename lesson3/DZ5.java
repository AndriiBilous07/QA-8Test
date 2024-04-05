package lesson3;

import java.util.Scanner;

public class DZ5 //Написать программу, используя тернарный
// оператор, где пользователь вводит с клавиатуры два
// числа и символ - или + или % или / или *. На экран
// выводится резултат действия над двумя введенными числами.
// Если пользователь ввел что-то кроме данных символов, то необходимо вывести 0

{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int numb1= scanner.nextInt();
        System.out.println( numb + numb1);
        System.out.println( numb - numb1);
        System.out.println( numb / numb1);
        System.out.println( numb * numb);
        System.out.println( numb % numb1);

    }
}
