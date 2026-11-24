import java.util.Scanner;

public class seratusharingoding {

    public static void main(String[] args) throws Exception {
        Scanner al = new Scanner(System.in);

      int[] nilai = {30,10,40,50,20,};
      int tertinggi = nilai[0];
      
      for(int a = 0; a<nilai.length; a++){
        if (nilai[a]>tertinggi) {
          tertinggi = nilai[a];
        }
      }
      System.out.println(tertinggi);
    } 
}
