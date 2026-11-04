import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

        System.out.print("masukkan bilngan faktorial : ");
        int f = al.nextInt();
        int hasil = 1;

        for(int a = 1; a<=f; a++){
          hasil *= a;
        }
        System.out.println("hasil dari "+f+"! adalah : "+hasil);
    }
  }
    
    

    
