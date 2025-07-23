package Day3;
import java.util.*;

public class FibonacciSeries {
  public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();

      if(n<=1){
          System.out.println(n);
          return;
      }
      int a=0,b=1;
      for(int i=2;i<=n;i++){
          int c = a + b;
          a = b;
          b = c;
      }
      System.out.println(b);
  }
}
