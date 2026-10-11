import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

    System.out.print("Masukkan umur penonton : ");
    int umur = al.nextInt();

    System.out.println("Apakah Mahasiswa ?");
    boolean Mahasiswa = al.nextBoolean();
    
    int harga;

    if (umur < 12) {
      harga = 30000;
    } else if (umur > 12 && umur < 18) {
      harga = 40000;
    } else {
      harga = 50000;
    }

    int total = harga;

    System.out.println("\nHarga tiket sebelum diskon : Rp" + total);
    
    if (Mahasiswa) {
      total = harga - (harga * 20/100);
      System.out.println("Diskon mahasiswa 20%");
    }

   System.out.println("Total bayar : Rp" + total);

    al.close();
    }
  }
