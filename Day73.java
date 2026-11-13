import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      int pilih;
      System.out.println("daftar menu: ");
      System.out.println("1. nasi goreng");
      System.out.println("2. mie goreng");
      System.out.println("3. ayam bakar");
      System.out.println("4. keluar");

      do {
        System.out.print("masukkan pilihan anda: ");
        pilih = al.nextInt();

        switch (pilih) {
          case 1:
            System.out.println("anda memilih nasi goreng");
            break;
          case 2:
            System.out.println("anda memilih mie goreng");
            break;
          case 3:
            System.out.println("anda memilih ayam bakar");
            break;
          case 4:
            System.out.println("terima kasih telah memesan, mohon tunggu pesanan anda");
            break;
          default:
            System.out.println("pilihan tidak valid, silakan coba lagi");
        }
      } while (pilih != 4);
    }
}
