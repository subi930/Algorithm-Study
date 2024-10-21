import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] str = new String[numbers.length];
        
        // int 배열을 String 배열로 변환
        for(int i = 0; i < numbers.length ; i++){
            str[i] = String.valueOf(numbers[i]);
        }

        // 문자열 배열을 비교하여 정렬
        Arrays.sort(str,((o1, o2) -> (o2 + o1).compareTo(o1 + o2)));

        // 모든 요소를 합친 결과를 문자열로 반환
        answer = String.join("", str);

        // 0으로 시작하는 경우(예: [0, 0, 0]) 처리
        if (answer.startsWith("0")) {
            answer = "0";
        }
        return answer;
    }
       
}