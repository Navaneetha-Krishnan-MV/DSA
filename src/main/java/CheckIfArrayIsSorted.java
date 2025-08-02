import java.util.ArrayList;
import java.util.Arrays;

public class CheckIfArrayIsSorted {

    public static boolean isSorted(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i] > arr[i+1]) return false;
        }
        return true;
    }
    public static void main(String[] args){

        ArrayList<int[]> ques = new ArrayList<>();
        ques.add(new int[]{2,3,1,10,7});
        ques.add(new int[]{1,2,3,4,5});
        ques.add(new int[]{10,12,20,45,89,110});
        ques.add(new int[]{20,10,50,35,44});

        for(int[] iter : ques){
            if( isSorted(iter) ){
                System.out.println(Arrays.toString(iter) +" is sorted");
            }else{
                System.out.println(Arrays.toString(iter) +" is not sorted");
            }
        }
    }

}
