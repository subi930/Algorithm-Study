// 1. 귤 배열 정렬
// 2. 중복 수 리스트 생성 및 저장
// 3. 중복수 리스트 정렬(오름차순)
// 4. k<중복수 리스트 요소 합 의 인덱스 + 1 = answer
import java.util.*;

class Solution {
    public int solution(int k, int [] tangerine) {
        int answer = 0;
        Integer[] tan = Arrays.stream(tangerine).boxed().toArray(Integer[]::new);
        Arrays.sort(tan, Collections.reverseOrder()); // 내림차순으로 정렬

        ArrayList<Integer> typeCount = new ArrayList<>();
        int count = 1;

        for (int i = 1; i < tan.length; i++) {
            if (tan[i - 1].intValue()==tan[i].intValue()) {
                count++;
            }else {
                typeCount.add(count);
                count = 1;
            }
        }
        typeCount.add(count);  // 마지막 count 추가
        typeCount.sort(Comparator.reverseOrder()); // 내림차순 정렬

        int sum = 0, idx = 0;
        while (sum < k && idx < typeCount.size()) {
            sum += typeCount.get(idx);
            idx++;
        }

        answer = idx;
        return answer;
    }
}