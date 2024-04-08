package lesson6_7;

import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Dz1  /*Написати програму “числа”, яка загадує випадкове число та пропонує гравцеві його вгадати.





Технічні вимоги:
        • За допомогою java.util.Random програма загадує випадкове число в діапазоні[0-100]
         та пропонує гравцеві через консоль ввести своє ім’я, яке зберігається в змінній name.
          • Перед початком на екран виводиться текст: Let the game begin!
          •Сам процес гри обробляється у нескінченному циклі.
          • Гравцеві пропонується ввести число в консоль,
           після чого програма порівнює загадану кількість з тим, що ввів користувач.
           • Якщо введене число менше загаданого, програма виводить на екран текст:
            Your number is too small. Please, try again..
             Якщо введене число більше за загадане, то програма виводить на екран текст:
              Your number is too big. Please, try again.. •
              Якщо введене число відповідає загаданому, то програма виводить текст:
              Congratulations, {name}!
              • Завдання повинно бути виконане за допомогою масиви
               (НЕ використовуйте інтерфейси List, Set, Map).*/ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Нехай розпочнеться гра");
        int numb = random.nextInt(100);
        System.out.println("Вкажіть ваше ім'я:");
        String name = scanner.nextLine();
        System.out.println("Привіт, " + name + "!");
        while (true) {
            System.out.println("Вкажіть число");
            int gamer = Integer.parseInt(scanner.nextLine());
            if (numb > gamer) {
                System.out.println("Ваше число замале спробуйте ще раз");
            } else if (numb < gamer) {
                System.out.println("Ваше число завелике спробуйет ще раз");
            } else
                System.out.println(" вітаю !!!");
        }
    }
}








/*
System.out.

println("Вкажіть число:");

int play = Integer.parseInt(scanner.nextLine());

            if(numb<play){
        System.out.

println("Ваше число замале. Спробуйте ще раз.");
            }else if(numb >play){
        System.out.

println("Ваше число завелике. Спробуйте ще раз.");
            }else{
                    System.out.

println("Вітаю, ви вгадали число!");
                break;
                        }
*/




       /* System.out.println("Вкажіть число");
int gamer = Integer.parseInt(scanner.nextLine());
        if (numb < gamer) {
        System.out.println("Ваше число замале спробуйте ще раз");
        } else if (numb > gamer) {
        System.out.println("Ваше число завелике спробуйет ще раз");
        } else if (numb == gamer)
        System.out.println(" вітаю !!!"); */



/* String[] gamer = new String[1];
        System.out.println("Вкажіть ваше імя");
        gamer = scanner.nextLine();
        System.out.println();*/