import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);
     
      System.out.print("masukkan angak N : ");
      int N = al. nextInt();
      
      System.out.println("angka ganjil :");
      for (int a = 1; a<=N; a++){
        if (a%2 != 0) {
          System.out.print(a+" ");
        }
        }
      System.out.println("\n");
      System.out.println("angka genap :");
      for (int b = 1; b<=N; b++){
        if (b%2 ==0) {
         System.out.print(b+" "); 
      }
      }
      }
      }
