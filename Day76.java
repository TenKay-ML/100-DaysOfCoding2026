import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

     System.out.print("Masukkan Nama Anda: "); 
     String nama = al.nextLine();

     System.out.println("=== PENGGUNAAN METHOD STRING MANIPULASI ===");
     System.out.println(nama.substring(0,2));
     System.out.println(nama.replace("Alhadi","Aldi"));
     System.out.println(nama.trim());

    }
}
