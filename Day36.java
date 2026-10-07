import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("Masukkan Angka : ");
      int A = al.nextInt();

      if (A % 2 == 0) {
        System.out.println("Ini Adalah Bilangan Genap");
      } else {
        System.out.println("Ini Adalah Bilangan Ganjil");
      }

    }
}
