import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("masukkan temperatur ruangan : ");
      int suhu = al.nextInt();

      if (suhu < 20) {
        System.out.println("suhu ruangan ini dingin");
      } else if (suhu > 20 && suhu < 28) {
        System.out.println("suhu ruangan ini normal");
      } else {
        System.out.println("suhu ruangan ini panas");
      }
    }
  }
