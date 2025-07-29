package Day5;
import java.util.*;

public class AmicableNumbers {

  public static int perfectNumber(int x){
      int sum = 0;

      for(int i=1;i<=x/2;i++){
          if(x%i == 0){
              sum += i;
          }
      }
      return sum;
  }

  public static void main(String[] args){
      Scanner s  = new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();

      if( (perfectNumber(a) == b) && (a == perfectNumber(b))){
          System.out.println("Amicable Numbers");
      }else{
          System.out.println("Not Amicable Numbers");
      }
  }
}
