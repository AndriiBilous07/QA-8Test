package lesson4_5;

import java.util.Arrays;
import java.util.Random;

public class  DZ6/* Заполнить массив на 45 элементов случайными числами
от -50 до +50. Найти минимальный элемент и вывести его
на консоль. Найти максимальный элемент и вывести его на
консоль.
 */
{
    public static void main(String[] args) {
        int [] Masiv = new int [45];
        for (int i = 0; i < Masiv.length; i++) {
            Masiv[i] = (i +50 - 50);
            int random = (int) ((Math.random() * 100) - 50);
            System.out.println(random);
        }
        System.out.println(Arrays.toString(Masiv));
        int minimum = Masiv[0];
        for(int i = 0; i < Masiv.length; i++){
            if(minimum > Masiv[i]){
                minimum = Masiv[i];
            }
        }
        System.out.println("Minimum from array is: " + minimum);

        System.out.println(Arrays.toString(Masiv));
        int max = Masiv[0];
        for(int i = 0; i > Masiv.length; i++){
            if( max > Masiv[i]){
                max = Masiv[i];
            }
        }
        System.out.println("Max from array is: " + max);
        }
    }
