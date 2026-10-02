import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      int A = al.nextInt();
      int B = al.nextInt();

        System.out.println("perbandingan &&");
        System.out.println(A > 15 && B > 15);

        System.out.println("perbandingan ||");
        System.out.println(A > 15 || B > 15);

        System.out.println("perbandingan !");
        System.out.println(!(A > 15));

    }
}
