package lesson4_5;

import com.sun.source.tree.ContinueTree;

import javax.xml.transform.Source;
import java.util.Scanner;

public class DZ1
//Написать программу, которая будет считывать введенные пользователем
//слова с клавиатуры слова, и склеивать их в одно предложение до тех пор,
//пока пользователь не введет с клавитуры слово STOP.
//Все слова введенные до этого должны отобразится в консоли
//одним предложением.
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть слово");
        while (true) {
            String word = scanner.next();
           if  (word != "STOP");
        if (word.equalsIgnoreCase ("STOP"));
        break;
        }
    }
}