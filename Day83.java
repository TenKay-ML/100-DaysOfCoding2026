import java.util.Scanner;

public class seratusharingoding {

    public static void main(String[] args) throws Exception {
        Scanner al = new Scanner(System.in);

      int[] nilai = {10,20,30,40,50,};
      int jumlah = 0;

      for(int a = 0; a<nilai.length; a++){
        jumlah += nilai[a];
      }
      System.out.println(jumlah);
    } 
}
