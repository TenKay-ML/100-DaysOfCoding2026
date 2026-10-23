import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("masukkan batas : ");
      int a = al.nextInt();
      int b = 1;
      

      while (b <= a) {
        System.out.println("bilangan ke" + b);
        b++;
      }

    }
}
