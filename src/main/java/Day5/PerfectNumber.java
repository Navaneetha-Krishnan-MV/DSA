package Day5;
import java.util.*;

public class PerfectNumber {
   public static void main(String[] args){
       Scanner s= new Scanner(System.in);

       int  n =s.nextInt();

       int sum = 0;

       for(int i=1;i<=n/2;i++){
           if(n%i == 0){
               sum += i;
           }
       }
       System.out.println( sum==n ? "Perfect Number" : "Not a perfect number");
   }
}
