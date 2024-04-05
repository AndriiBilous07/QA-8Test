package lesson4_5;

import java.util.Scanner;

public class DZ2 // Написать программу в которой пользователь вводит с клавиатуры число,
// а программа определяет, является она полиндромом или нет.
// И выводит данную информацию на экран.
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Це число полідромне?");
        int number = scanner.nextInt();
        while (true) {
            System.out.println(number <= number);
            break;
        }
    }

}