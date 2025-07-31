package Day9;
import java.util.*;

public class PalindromicPramid {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i=1;i<=n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            int length = (2*i-1);
            int j=1;
            for(j=1;j<=(length/2 + 1);j++){
                System.out.print(j);
            }
            for(j=j-2;j>=1;j--){
                System.out.print(j);
            }

            System.out.println();
        }

    }
}
