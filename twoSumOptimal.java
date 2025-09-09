import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];
        answer[0] = answer[1] = -1;

        HashMap<Integer,Integer>hm = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int num = nums[i];
            int moreNeeded = target - num;
            if(hm.containsKey(moreNeeded)){
                answer[0] = hm.get(moreNeeded);
                answer[1]  = i;
                return answer;
            }
            hm.put(nums[i],i);
        }
        return answer;
        
      
    }
}
