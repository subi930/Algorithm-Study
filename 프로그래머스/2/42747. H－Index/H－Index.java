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
        
        // h 검사
        while(true){
            idx = 0; // h와 비교할 idx 및 횟수
            
            // h번 미만 인용논문 세기 검사
            while(citations[idx] < h) {
                idx++;
            }
            
            // h번 이상 인용된 논문 수(length-idx)가 h 이상 일 시, answer 도출
            if(length-idx>=h) {
                answer = h;
                break;
            }
            // h의 값 감소 후 h검사 다시
            else {
                h--;
            }
        }
        return answer;
    }
}