package lesson6_7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Dz2  /*Массив заполняется случайными числами от 0 до 1000.
Необходимо создать одномерный массив, состоящий из максимальных значений
каждого отдельного массива входящего в двумерный.
Новый полученный массив вывести на экран.
*/ {
    public static void main(String[] args) {
        Random random = new Random(1000);
        int[][] masiv = new int[5][5];
        int[] masiv2 = new int[5];
        System.out.println("Максимальні значення кожного рядка:");
        for (int i = 0; i < masiv2.length; i++) {
            System.out.println("Рядок " + (i + 1) + ": " + masiv2[i]);
            for (int q = 0; q < 5; q++) {
                for (int j = 0; j < 5; j++) {
                    masiv[i][j] = random.nextInt(1001);
                }
            }

        }
    }
}
