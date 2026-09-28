import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("masukkan angka yang ingin diincrenent : ");  
      int angkaP = al.nextInt();
      System.out.print("masukkan angka yang ingin didecremen  : ");
      int angkaN = al.nextInt();

      ++angkaP;
      --angkaN;

      System.out.println("\nhasil dari angka yang diincrenent adalah "+angkaP);
      System.out.println("hasil dari angka yang didecremen adalah "+angkaN);
    }
}
