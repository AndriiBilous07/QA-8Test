package lesson4_5;

import java.util.Arrays;
import java.util.Scanner;

public class DZ4 /* Первый будет состоять из следующих имен:
"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб".
Второй будет содержать следующие значения типа int:
10, 12, 14, 16, 18, 20.
Третий будет содержать следующие значения:
"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику".
Пользователь вводит три числа с клавиатуры, которые будут соответствовать
индексам каждого из элементов массивов.
Пример1. после ввода 3,2,1:
На экране должно вывестись следующее сообщение:
"Федя будет идти в магазин в 14:00"
Пример2. после ввода 1,2,3:
На экране должно вывестись следующее сообщение:
"Маша будет идти в тренажерный зал в 14:00"  */ {
    public static void main(String[] args) {
        String[] words = new String[]{"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        String result = "{NAME}";
        int indeckName = new Scanner(System.in).nextInt();
        while (indeckName < 0 || indeckName > 6) {
            System.out.println("");
            indeckName = new Scanner(System.in).nextInt();
        }
        System.out.println(result.replace("{NAME}", words[indeckName]));

        String[] words2 = new String[]{"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        String result1 = "Буде йти в {NAME}";
        int indeckName1 = new Scanner(System.in).nextInt();
        while (indeckName1 < 0 || indeckName1 > 6) {
            System.out.println("");
            indeckName1 = new Scanner(System.in).nextInt();
        }
        System.out.println(result1.replace("{NAME}", words2[indeckName1]));

        int[] number = new int[]{10, 12, 14, 16, 18, 20};
        String result2 = "  {NUM} :00 ";
        int indexName = new Scanner(System.in).nextInt();
        while (indexName < 0 || indexName > 5) {
            System.out.println("");
            indexName = new Scanner(System.in).nextInt();
        }
        System.out.println(number + "o" + result2  );
        /*  ніяк не можу доробити останій рядок не розумію чому і як вивести час*/

    }
}
