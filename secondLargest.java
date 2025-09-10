import java.util.*;
public class Main
{
    public static int LargestOptimized(int[] arr){
        int large = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        int secondlarge = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            if(arr[i] > secondlarge && arr[i] != large){
                secondlarge = arr[i];
            }
            
        }
        
        return secondlarge;
    }
	public static void main(String[] args) {
		int[] arr = {3,2,1,5,4,7,6};
		System.out.println("Second largest : "+LargestOptimized(arr));
		
	}
}
