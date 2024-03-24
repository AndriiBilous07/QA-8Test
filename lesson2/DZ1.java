package lesson2;

public class DZ1 //Создать переменную string1 = "This line that i want to cut, cause
// it is too long".
// Создать строку string2 в которой должно быть помещено значение строки string1,
// Обрезанное до "This line that i want to cut, cause".
// Создать строку string3 на основе string2 которое будет содержать значение
// "This line that don't want to cut, cause it is perfect".
// Вывести на консоль каждое сообщение и его длину.

        {
                public static void main(String[] args) {
                     String one = "This line that i want to cut," +
                             "cause it is too long";
                    String[] oneArray =  one.split("it");
                    System.out.println(oneArray[0].trim());
                     String two = "This line that i want to cut, cause";
                     String three = "This line that i want to cut," +
                             "cause it is too long";
                    System.out.println(three.replace("too long",
                            "perfect"));

                    //"This line that i want to cut," cause it is too long" (53)
                    //"This line that i want to cut, cause" (37)
                    //"This line that i want to cut, cause it is too long" (52)







                }


}
