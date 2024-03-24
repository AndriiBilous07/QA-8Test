package lesson1;

public class DZ1 //mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
   //volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);opel = volvo = mercedes*3
//Необходимо вычислить значения mersedes, volvo и opel.
 {
  public static void main(String[] args) {
      int mercedes = (1 + (3 * (2 - 4)) % 3 + (11 - 7) * 2) + (3 - 5) * 3;
      int volvo = mercedes * 3 - 9 % mercedes + 16 - (-mercedes);
      int opel = mercedes % volvo;
      System.out.println(mercedes);
      System.out.println(volvo);
      System.out.println(opel);

      //  mercedes =3
      // volvo = 28
      //  opel = 3


  }}