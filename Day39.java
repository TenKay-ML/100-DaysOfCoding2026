import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

    System.out.print("masukkan angka : ");
    int a = al.nextInt();
    System.out.print("masukkan operator : ");
    char b = al.next().charAt(0);
    System.out.print("masukkan angka : ");
    int c = al.nextInt();

    if (b == '+') {
      System.out.println("hasilnya : " + (a+c));
    } else if (b == '-') {
      System.out.println("hasilnya : " + (a-c));
    } else if (b == '*') {
      System.out.println("hasilnya : " + (a*c));
    } else if (b == '/') {
      System.out.println("hasilnya : " + (a/c));
    } else if (b == '%') {
      System.out.println("hasilnya : " + (a%c));
    }
    al.close();
    }
  }
