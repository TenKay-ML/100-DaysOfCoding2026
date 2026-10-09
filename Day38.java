import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

     System.out.println("=====MENU MAKANAN=====");
      System.out.println("MENU 1 : AYAM GEPREK + ES TEH");
      System.out.println("MENU 2 : AYAM LALAPAN + ES JERUK");
      System.out.println("MENU 3 : AYAM BAKAR + AMERICANO");
      System.out.println("JIKA KAMU MAU MEMILIH MENU MAKA INPUTLAH ANGKA 1, 2, DAN 3 !");
      System.out.println("======================\n");

      System.out.print("Masukkan Angka : ");
      int menu = al.nextInt();
      System.out.println("\n");
      
    if (menu==1) {
      System.out.println("ANDA MEMILIH MENU 1");
    } else if (menu==2) {
      System.out.println("ANDA MEMILIH MENU 2");
    } else if (menu==3) {
      System.out.println("ANDA MEMILIH MENU 3");
    } else {
      System.out.println("MOHON MAAF MENU TIDAK TERSEDIA");
    }
    }
  }
