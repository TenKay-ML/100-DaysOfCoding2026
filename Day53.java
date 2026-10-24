import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("masukkan batas : ");
      int batas = al.nextInt();
      int a = 1;

      do{
        System.out.println("bilangan ke" + a);
        a++;
      } while (a < batas);
      }
  }
