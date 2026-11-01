import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

    System.out.print("masukkan angka N : ");
    int n = al.nextInt();
    int jumlah = 1;

    for (int a = 1; a <= n; a++) {
      jumlah *= a;
        }
        System.out.println(jumlah);

    }
}
