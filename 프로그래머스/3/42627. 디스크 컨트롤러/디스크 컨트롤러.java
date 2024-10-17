import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        int now = 0; // 현재 시간
        int cnt = 0; // 수행된 작업 수
        int idx = 0; // jobs 인덱스
        int time = 0;

        Arrays.sort(jobs,(o1, o2) -> o1[0]-o2[0]); // 요청시간 오름차순
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((o1,o2) -> o1[1]-o2[1]); // 처리시간 오름차순
        while (cnt < jobs.length){
            while(idx < jobs.length && now >= jobs[idx][0]) minHeap.add(jobs[idx++]);
            if(minHeap.isEmpty()) now = jobs[idx][0];
            else {
                now += minHeap.peek()[1];
                time += (now-minHeap.peek()[0]);
                minHeap.poll();
                cnt++;
            }
        }
        time /= jobs.length;
        return time;
    }
}