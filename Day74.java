import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

     System.out.print("Masukkan Nama Anda: "); 
     String nama = al.nextLine();

     System.out.println("====== HASILNYA ======");
     System.out.println("Nama Anda: " + nama.length() + " Karakter");
     System.out.println("Nama Anda: " + nama.toUpperCase());
     System.out.println("Nama Anda: " + nama.toLowerCase());
    }
}
