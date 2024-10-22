import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int length = citations.length;
        int max;

        Arrays.sort(citations);
        max = citations[length-1] < length ? citations[0]:length;
        int h = max;

        int idx = 0;
        while(true){
            idx = 0;
            while(citations[idx] < h) {
                idx++;
            }
            if(length-idx>=h) {
                answer = h;
                break;
            }
            else {
                h--;
            }
        }
        return answer;
    }
}