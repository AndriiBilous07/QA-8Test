package lesson6_7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dz2  /*Массив заполняется случайными числами от 0 до 1000.
Необходимо создать одномерный массив, состоящий из максимальных значений
каждого отдельного массива входящего в двумерный.
Новый полученный массив вывести на экран.
*/
{
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int [] masiv = new int[1];
        int[][] masiv2 = new int[2][2];
        for (int i = 0; i < masiv2.length; i++) {
         masiv2 [i] = new int[]{random.nextInt(1001)};
        }for (int i = 0; i < masiv.length; i++) {
            masiv2 [i] = new int[]{random.nextInt(1001)};
        }

        System.out.println(Arrays.deepToString(masiv2));
        System.out.println(Arrays.toString(masiv));


    }
}
