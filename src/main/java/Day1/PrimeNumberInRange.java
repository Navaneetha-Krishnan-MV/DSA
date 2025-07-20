package Day1;
import  java.util.*;

public class PrimeNumberInRange {

    public static boolean isPrime(int n){
        if(n<=1) return false;

        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the start and end range : ");
        int start = s.nextInt();
        int end = s.nextInt();

        int ans = 0;
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                ans++;
            }
        }
        System.out.println("Prime Numbers : "+ans);
    }
}
