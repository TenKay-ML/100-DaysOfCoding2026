import java.util.Scanner;
public class belajar {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("Masukkan Nilai UTS: ");
      int A = al.nextInt();

      System.out.print("Masukkan Nilai UAS: ");
      int B = al.nextInt();
      
     //opertor aritmatika
      int C = A + B;
      double rata = C / 2;
      System.out.println("Rata-rata nilai : " + rata);

      //operator perbandingan
      System.out.println("Status Mahasiswa: " + (rata >= 75 ? "Lulus" : "Tidak Lulus"));

      //operator logika
      System.out.println("Nilai UTS valid: " + (A > 75 && A < 100));
      System.out.println("Nilai UAS valid: " + (B > 75 && B < 100));
      
    }
}
