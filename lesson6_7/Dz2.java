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
        Random random = new Random();
        int[][] masiv = new int[5][1];
        int[] masiv2 = new int[5];
        System.out.println("Максимальні значення кожного рядка:");
        for (int i = 0; i < masiv.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < masiv[i].length; j++) {
                masiv[i][j] = random.nextInt(1001);
                if (masiv[i][j] > max) {
                    max = masiv[i][j];
                        masiv2[i] = max;
                        System.out.println("Рядок " + (i + 1) + ": " + masiv2[i]);
                    }
                }
            }

        }
    }

