import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("masukkan angka : ");
      int a = al.nextInt();

      String hasil = (a % 2 == 0) ? "angka genap" : "angka ganjil";

      System.out.println("angka tersebut adalah " + hasil);
      }
}
