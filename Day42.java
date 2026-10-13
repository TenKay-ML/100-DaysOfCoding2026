import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("masukkan gaji bulanan : Rp");
      int gaji = al.nextInt();

      int gajibersih;

      //apabila gaji > 3.000.000 maka ia akan dikenakan pajak sebesar 15% dan apabila gaji < 3.000.000 maka ia akan dikenakan pajak sebesar 10% !!

      if (gaji > 3000000) {
        gajibersih = gaji - (gaji * 15/100);
      } else {
        gajibersih = gaji - (gaji * 10/100);
      }

      System.out.println("Gaji bersih anda : Rp" + gajibersih);

      al.close();
    }
  }
