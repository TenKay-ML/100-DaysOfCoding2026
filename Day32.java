import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("Masukkan Nilai : ");
      int A = al.nextInt();
      
      System.out.println("\n===Operator Perbandingan===");
      System.out.println(A > 70);
      System.out.println(A < 70);
      System.out.println(A >= 70);
      System.out.println(A <= 70);
      System.out.println(A == 70);
      System.out.println(A != 70);

      System.out.println("\n===Operator Logika===");
      System.out.println(A > 70 && A < 100);
      System.out.println(A < 70 || A > 100);
      System.out.println(!(A >= 70));

    }
}
