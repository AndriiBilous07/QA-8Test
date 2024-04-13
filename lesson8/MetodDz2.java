package lesson8;

public class MetodDz2  /* Написать перегруженный метод, который может:

•	Не принимать никаких значений, тогда он будет выводить на консоль сообщение типа: "Я пустой".
•	Принимать в качестве параметров String, тогда он будет выводить на консоль это сообщение.
•	Принимать в качестве параметров массив строк, тогда он будет выводить на консоль все его значения через пробел.
•	Принимать в качестве параметра массив чисел, тогда он будет выводить на консоль сумму элементов массива.
•	Принимать в качестве параметров число и строку, тогда он будет выводить на консоль сообщение типа:
"Ваше сообщение - "%%%%%%%%", ваше число -  $", где "%%%%%%%%" и $ ваши введенные строка и число соответственно.*/
 {
  public static void main(String[] args) {
   MetodDz2 q = new MetodDz2();
   q.perMetod();
   q.perMetod("");
   q.perMetod(new String[]{});
   q.perMetod(new int[]{12,32,22,46});
   q.perMetod("My text", 14, "це все тут");
  }


  public void perMetod(){
   System.out.println("Я пуст");}


   public void perMetod(String text ) {
    System.out.println("тогда он будет выводить на консоль это сообщение.");}


  public void perMetod(String[] strings)
  {
   System.out.println("Java Metod Peregruz");}


  public void perMetod (int[] number)
  {int sum = 0;
   for (int num : number) {
    sum += num;}
   System.out.println("Сума елементів масиву: " + sum);}


  public void perMetod (String slovo,int number,String slovo2){
   System.out.println("моє повідомлення - " + slovo + " Число - " + number + " " + slovo2+ " ");
  }
 }



