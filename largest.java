import java.util.*;
public class Main
{
    public static int LargestBrute(int[] arr){
        Arrays.sort(arr);
        return arr.length;
    }
    
    public static int LargestOptimized(int[] arr){
        int large = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }
        return large;
    }
	public static void main(String[] args) {
		int[] arr = {3,2,1,5,4,7,6};
		System.out.println("Brute of largest : "+ LargestBrute(arr));
		System.out.println("Optimized of largest : "+LargestOptimized(arr));
		
	}
}
