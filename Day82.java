import java.util.Scanner;

public class seratusharingoding {

    public static void main(String[] args) throws Exception {
        Scanner al = new Scanner(System.in);

      System.out.print("masukkan jumlah inputan : ");
      int a = al.nextInt();
      int[] ar = new int[a];
      int tertinggi = ar[0];

      System.out.println("Masukkan angka :");
      for(int b =0; b<a; b++){
        ar[b] = al.nextInt();

        if (ar[b]>tertinggi) {
          tertinggi = ar[b];
        }
      } 
       System.out.println("Nilai tertingginya adalah : "+tertinggi); 
      
    } 
}
