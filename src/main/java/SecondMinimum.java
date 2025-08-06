import java.util.*;

public class SecondMinimum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = s.nextInt();
        }

        int min1 = Integer.MAX_VALUE;
        int min2 = min1;

        for(int i=0;i<n;i++){

            if(arr[i] <= min1){
                min2 = min1;
                min1 = arr[i];
            }else if(arr[i] < min2){
                min2 = arr[i];
            }
        }
        if(min1 == min2){
            System.out.println(-1);
            return;
        }
        System.out.println(min2);
    }
}
