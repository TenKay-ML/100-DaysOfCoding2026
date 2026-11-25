import java.util.Scanner;

public class seratusharingoding {

    public static void main(String[] args) throws Exception {
        Scanner al = new Scanner(System.in);

      int[] nilai = {60,45,20,75,61};
      int terendah = nilai[0];
      
      for(int a = 0; a<nilai.length; a++){
        if (nilai[a]<terendah) {
          terendah = nilai[a];
        }
      }
      System.out.println(terendah);
    } 
}
