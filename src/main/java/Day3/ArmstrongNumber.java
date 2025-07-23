package Day3;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class ArmstrongNumber {

    public static boolean isArmstrong(int i){
        int sum = 0,digit = i,n = String.valueOf(i).length();

        while(digit > 0){
            int rem = digit%10;
            sum += Math.pow(rem , n);
            digit /= 10;
        }
        if(sum == i) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the lowest number : ");
        int l = s.nextInt();
        System.out.println("Enter highest number : ");
        int h = s.nextInt();
        int ans = 0;
        for(int i=l;i<=h;i++){
            if(isArmstrong(i)){
                ans++;
            }
        }
        System.out.println(ans);
    }
}
