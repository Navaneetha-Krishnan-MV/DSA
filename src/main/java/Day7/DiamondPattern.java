package Day7;
import java.awt.*;
import java.util.*;

public class DiamondPattern {
  public static void main(String[] args){
      Scanner s = new Scanner(System.in);

      int n = s.nextInt();

      for(int i=1;i<=n;i++){
          for(int j=1;j<=n-i;j++) {
              System.out.print(" ");
          }
          for(int j=1;j<=i;j++){
              System.out.print(j+" ");

          }
          System.out.println();
      }

      for(int i=n-1;i>=1;i--){

          for (int j=i;j<=n-1;j++){
              System.out.print(" ");
          }

          for (int j=1;j<=i;j++){
              System.out.print(j+" ");
          }
          System.out.println();
      }
  }
}
