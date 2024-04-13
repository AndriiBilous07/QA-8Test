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
        //Scanner scanner = new Scanner(System.in);
        /*Random random = new Random();
        int [] masiv = new int[1];
        int[][] masiv2 = new int[2][2];
        for (int i = 0; i < masiv2.length; i++) {
         masiv2 [i] = new int[]{random.nextInt(1001)};
        }for (int i = 0; i < masiv.length; i++) {
            masiv2 [i] = new int[]{random.nextInt(1001)};
        }

        System.out.println(Arrays.deepToString(masiv2));
        System.out.println(Arrays.toString(masiv));*/


        int[][] matrix = generateRandomMatrix(5, 5);
        int[] maxValues = findMaxValues(matrix);

// Виведення максимальних значень
        System.out.println("Максимальні значення кожного рядка:");
        for (int i = 0; i < maxValues.length; i++) {
            System.out.println("Рядок " + (i + 1) + ": " + maxValues[i]);
        }
    }

    // Метод для генерації двовимірного масиву з випадковими числами
    public static int[][] generateRandomMatrix(int rows, int cols) {
        Random random = new Random();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(1001); // Випадкове число від 0 до 1000
            }
        }

        return matrix;
    }

    // Метод для знаходження максимальних значень кожного рядка
    public static int[] findMaxValues(int[][] matrix) {
        int[] maxValues = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
            maxValues[i] = max;
        }

        return maxValues;
    }
}