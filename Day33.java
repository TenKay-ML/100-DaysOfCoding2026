import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("Masukkan Nilai  UTS : ");
      int A = al.nextInt();

      if (A >= 75) {
        System.out.println("Selamat Anda Lulus");
      } else {
        System.out.println("Maaf Anda Tidak Lulus");
      }

    }
}
