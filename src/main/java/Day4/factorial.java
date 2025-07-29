package Day4;

import java.math.BigInteger;
import java.util.*;

public class factorial {

    public static BigInteger factorial(int n){
        if(n<=1){
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n-1));
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        BigInteger ans = factorial(n);
        System.out.println(ans);
    }
}

