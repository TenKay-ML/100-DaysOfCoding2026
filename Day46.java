import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.println("===MENU MAKANAN===");
      System.out.println("1. Ayam Crispy");
      System.out.println("2. Ayam Goreng");
      System.out.println("3. Ayam Bakar");
      System.out.println("4. Ayam Kecap");

      System.out.print("Pilih Menu (1-4): ");
      int pilihan = al.nextInt();

      switch (pilihan) {
        case 1:
          System.out.println("Anda memilih Ayam Crispy");
          break;
        case 2:
          System.out.println("Anda memilih Ayam Goreng");
          break;
        case 3:
          System.out.println("Anda memilih Ayam Bakar");
          break;
        case 4:
          System.out.println("Anda memilih Ayam Kecap");
          break;
        default:
          System.out.println("Pilihan tidak valid");
      }

    }
}
