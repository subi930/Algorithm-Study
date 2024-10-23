import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0,wmax = 0, hmax = 0;
        for(int i = 0 ; i < sizes.length ; i++ ) {
            Arrays.sort(sizes[i]);
            if(wmax < sizes[i][0]) wmax = sizes[i][0];
            if(hmax < sizes[i][1]) hmax = sizes[i][1];
        }
        answer = wmax * hmax;
        return answer;
    }
}