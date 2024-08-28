import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int count = nums.length/2;
        int answer = 0;
        List<Integer> kind = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++) {
            if (kind.contains(nums[i])==false){
                kind.add(nums[i]);
            }
        }
        int size= kind.size();
        
        if(count<=size) answer = count;
        else answer = size;
        
        return answer;
    }
}