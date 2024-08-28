import java.util.*;
class Solution {
    public int solution(int[] nums) {
         int count = nums.length/2;
        int answer = 0;

        HashSet<Integer> kind = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++) {
            kind.add(nums[i]);
        }
        int size= kind.size();

        if(count<=size) answer = count;
        else answer = size;
        
        return answer;
    }
}