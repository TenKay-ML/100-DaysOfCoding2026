import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      int n = al.nextInt();
      int jumlah = 0;

      for (int a = 1; a<=n; a++){
        jumlah += a;
      }
      System.out.println(jumlah);
      }
  }
