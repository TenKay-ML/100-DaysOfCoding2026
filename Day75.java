import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

     System.out.print("Masukkan Nama Anda: "); 
     String nama = al.nextLine();

     System.out.println("=== PENGGUNAAN METHOD STRING PENGECEKAN ===");
     System.out.println(nama.equals("Alhadi"));
     System.out.println(nama.equalsIgnoreCase("alhadi"));
     System.out.println(nama.contains("A"));
     System.out.println(nama.isEmpty());

    }
}
