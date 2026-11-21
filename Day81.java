import java.util.Scanner;

public class seratusharingoding {

    public static void main(String[] args) throws Exception {
        Scanner al = new Scanner(System.in);

    int[ ] angka = new int[3];
    for(int b = 0; b<3; b++){
    System.out.print("masukkan angka : ");
    angka[b]= al.nextInt();
  }

    System.out.println("===== hasilnya=====");

    
    for(int c = 0; c<3; c++){
    System.out.println("isi array ke "+c+" adalah "+angka[c]);
  }
    } 
}
