package Day7;
import java.util.*;

public class FullPyramidWithCharacters {
  public static void main(String[] args){
      Scanner s = new Scanner(System.in);

      int n = s.nextInt();

      for(int i=1;i<=n;i++){
          for(int j=1;j<=n-i;j++){
              System.out.print(" ");
          }

          char ch = 'A';
          for(int j=1;j<=i;j++){
              System.out.print(ch+" ");
              ch++;
          }

          System.out.println();
      }
  }

}
