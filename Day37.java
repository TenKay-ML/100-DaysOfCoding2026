import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("Masukkan Angka : ");
      int A = al.nextInt();
      
     if (A>0) {
      System.out.println("ini adalah bilangan positif");
     } else if (A<0) {
      System.out.println("ini adalah bilangan negatif");
     } else {
      System.out.println("ini adalah angka nol");
     }
    }
  }
