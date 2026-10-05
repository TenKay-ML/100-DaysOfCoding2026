import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

      System.out.print("Masukkan Angka : ");
      int A = al.nextInt();
      
      if (A%2==0) { System.out.println("Bilangan positif dan kelipatan 2");    
    } else if (A>0) { System.out.println("Bilangan positif"); 
    }
    }
}
