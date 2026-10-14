import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("masukkan angka : ");
      int a = al.nextInt();

      if (a % 5 == 0 && a % 3 == 0) {
        System.out.println("angka tersebut adalah kelipatan 5 dan 3");
      } else if (a % 5 == 0) {
        System.out.println("angka tersebut adalah kelipatan 5");
      } else if (a % 3 == 0) {
        System.out.println("angka tersebut adalah kelipatan 3");
      } else {
        System.out.println("angka tersebut bukan kelipatan 5 atau 3");
      }

      al.close();
     
    }
  }
