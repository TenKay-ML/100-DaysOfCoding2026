import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("masukkan nilai anda : ");
      int a = al.nextInt();

      if (a >= 85) {
        System.out.println("Predikat nilai anda \"A\"");
      } else if (a >= 70 && a <= 84) {
        System.out.println("Predikat nilai anda \"B\"");
      } else if (a >= 55 && a <= 69) {
        System.out.println("Predikat nilai anda \"C\"");
      } else if (a >= 40 && a <= 54) {
        System.out.println("Predikat nilai anda \"D\"");
      } else {
        System.out.println("Predikat nilai anda \"E\"");
      }

      al.close();
     
    }
  }
