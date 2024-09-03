import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
       
        HashMap<String, List<String>> clothesMap = new HashMap<>();

        for (String[] c : clothes) {
            clothesMap.putIfAbsent(c[1], new ArrayList<>());
            clothesMap.get(c[1]).add(c[0]);
        }

        int answer = 1;

        for (String key : clothesMap.keySet()) {
            answer *= (clothesMap.get(key).size() + 1);
        }

        answer -= 1; // 아무것도 착용하지 않은 경우를 제외
        
        return answer;
    }
}