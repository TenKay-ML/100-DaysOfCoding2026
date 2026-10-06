import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("Masukkan Angka : ");
      int A = al.nextInt();
      
      if (A>=80) { 
          if (A>=90) { 
        System.out.println("Selamat Anda Mendapatkan Nilai A");
      } else { 
        System.out.println("Selamat Anda Mendapatkan Nilai B");
      }
      } else { 
        System.out.println("Mohon Maaf Anda Mendapatkan Nilai E");
      }
    }
  }
