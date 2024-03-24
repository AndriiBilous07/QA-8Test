package lesson1;

public class DZ2
    // int x = 3;
    //int y = ++x*2;
    //x+=-y*3 + ++x + --y;
    //y+=(-x++)%3;
    //int z = x + y;
    //Необходимо вычислить значения x, y и z.

{
    public static void main(String[] args) {
        int x = 3;
        int y = ++x*2;
        x+=-y*3 + ++x + --y;
        y+=(-x++)%3;
        int z = x + y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        // відповідь
        // x = -7
        // y = 9
        // z = 2


    }
}

