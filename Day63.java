import java.util.Scanner;

public class belajarjava {
    public static void main(String[] args) {
      Scanner al = new Scanner(System.in);

        System.out.print("masukkan angkanya : ");
        int M = al.nextInt();
        System.out.print("masukkan pangkatnya : ");
        int N = al. nextInt();

        int hasil =1;

        for (int a = 1; a <= N; a++){
            hasil = hasil * M;
        }
        System.out.println(hasil);
        }
        }
    
    

    
