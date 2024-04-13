package lesson6_7;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.RunnableFuture;

public class Dz3 /*• Даний квадрат 5х5, де програма випадковим чином ставить ціль.
• Перед початком гри на екран виводиться текст: All Set. Get ready to rumble!.
• Сам процес гри обробляється у нескінченному циклі.
• Гравцеві пропонується ввести лінію для стрільби; програма перевіряє, щоб було введено число,
 і введена лінія знаходиться в межах ігрового поля (1-5).
 У випадку, якщо гравець помилився, пропонує ввести число ще раз.
• Гравцю пропонується ввести стовпчик для стрільби (має проходити аналогічну перевірку).
• Після кожного пострілу необхідно показувати оновлене ігрове поле у консолі.
 Клітинки, куди гравець вже стріляв, слід зазначити як *.
• Гра закінчується при попаданні в ціль. Наприкінці гри вивести в консоль фразу You have won!, а також ігрове поле.
• Уражену ціль відзначити як x.
• Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).*/ {
    public static void main(String[] args) {

        char[][] game = new char[5][5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        char simvol = '-';
        System.out.println("All Set. Get ready to rumble!");

            for (int i = 0; i < game.length; i++) {
                for (int l = 0; l < game[i].length; l++) {
                    System.out.print(simvol);
                    if (i == l || l == 0 || l == game[i].length - 1) {
                        System.out.print(" ");
                    } else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
            }
        }

}








       /* for (int i = 0; i < number; i++) {
            for (int l = 0; l < number; l++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
        while (true) {
            int game = Integer.parseInt(scanner.next());
            if (game < '-'){
                System.out.println("мимо" + symbol + " *");

                for (int i = 0; i < number; i++) {
                    for (int l = 0; l < number; l++) {
                        System.out.print(symbol + " ");
                    }
                    System.out.println();
                }
                continue;
            } else if ( game > '-'){
                System.out.println("попали " + symbol + "@");
            }
            System.out.println("гра завершена ви виграли");
            break;
        }
    }

}  */

/*System.out.println(a);
                int pole = (5);
                int pole2 = (5);
                while (true){
                    int w = pole;
                    int e = pole2;
                    System.out.println(w);
                    System.out.println(e);
                }*/

/* int a = scanner.nextInt();
               int b = random.nextInt();*/