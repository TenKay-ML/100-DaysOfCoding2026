import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("masukkan batas : ");
      int a = al.nextInt();

      for (int b = 1; b <= a; b++) {
        System.out.println("bilangan ke " + b);
      }
      }
  }
