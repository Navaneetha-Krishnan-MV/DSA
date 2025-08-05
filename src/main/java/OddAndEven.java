
import java.util.*;

public class OddAndEven {

    public static void main(String[] args){
        Scanner s= new Scanner(System.in);

        int n = s.nextInt();

        int[] arr =  new int[n];
        int odd = 0;
        int even = 0;
        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
            if(arr[i]%2 == 0) even++;
            else odd++;
        }
        System.out.println(even+" "+odd);

    }

}
