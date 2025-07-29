package Day4;
import java.util.*;

public class PrimeFactor {
 public static void main(String[] args){
     Scanner s = new Scanner(System.in);

     int n = s.nextInt();

     HashSet<Integer> set = new LinkedHashSet<>();

     for(int i=2;i<=n;i++){
         if(n%i == 0) {
             while (n % i == 0) {
                 n /= i;
             }
             set.add(i);
         }
     }

     for(int i:set){
         System.out.println(i+" ");
     }
 }

}
