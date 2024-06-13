import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int solution(int[] numbers, int target) {
        int ans =0;
        Queue<Integer> queue = new LinkedList<>();

        // 전달받은 numbers를 너비우선 탐색으로 탐색
        // 다음 갈 수 있는 길은 +, -  가지 이기 때문에 2가지를 모두 큐에 넣는다.
        // 초기값을 큐에 추가
        queue.add(0);

        // 너비 우선 탐색으로 숫자를 탐색
        for (int num : numbers) {
            int size = queue.size(); // 현재 큐의 크기를 저장
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                queue.add(current + num);
                queue.add(current - num);
            }
        }
        while (!queue.isEmpty()) {
            if (queue.poll() == target) {
                ans++;
            }
        }
        return ans;
    }
}