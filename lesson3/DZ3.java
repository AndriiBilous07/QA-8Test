package lesson3;

import java.util.Scanner;

public class DZ3 // При помощи тернарного оператора необходимо
// получить разность двух чисел введенных с клавиатуры,
// и всегда отнимать от большего меньшее.
// Вывести эту разность в консоль.
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("введіть число");
        int num = sc.nextInt();
        System.out.println("ведіть число");
        int num1 = sc.nextInt();
        int NUMBER = num > num1 ? num - num1 : num1 - num;
        System.out.println(NUMBER);
    }
}

