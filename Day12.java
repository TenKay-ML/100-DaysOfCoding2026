 /**
  * belajarjava
  */
import java.util.Scanner;
 public class belajarjava {
   
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("NAMA : ");
        String nama = input.nextLine();
        
        System.out.print("NIM : ");
        String nim = input.nextLine();

        System.out.print("ALAMAT : ");
        String alamat = input.nextLine();

        System.out.print("TEMPAT DAN TANGGAL LAHIR : ");
        String ttl = input.nextLine();

        System.out.print("JENIS KELAMIN : ");
        String jk = input.nextLine();
        
        System.out.println("===============BIODATA DIRI===============");
        System.out.println("NAMA \t\t\t\t: " + nama);
        System.out.println("NIM \t\t\t\t: " + nim);
        System.out.println("ALAMAT \t\t\t\t: " + alamat);
        System.out.println("TEMPAT DAN TANGGAL LAHIR \t: " + ttl);
        System.out.println("JENIS KELAMIN \t\t\t: " + jk);  
        System.out.println("==========================================");
        
        input.close();
    }
 }
