package Day1;
import java.util.*;

public class SumOfNaturalNumbers {
   public static  void main(String[] args){

       Scanner s = new Scanner(System.in);
       System.out.print("Enter a number : ");
       int n = s.nextInt();

//       int sum = 0;
//       for(int i=1;i<=n;i++){
//           sum += i;
//       }
       int sum = n*(n+1)/2;

       System.out.printf("Sum of %d natural number is %d",n,sum);
   }
}
