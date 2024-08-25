/*
[ PriorityQueue 활용 풀이 ]
1. 우선순위 큐 선언 ( reverse 높은 숫자의 데이터가 먼저 나가는 구조 )
2. 우선순위 큐에 priorities 원소들 삽입
3. 우선순위 큐가 공백 큐가 될때까지 의 while 문 실행 검사
4. while문 안에 priorites 길이만큼 for문 실행
5. for문 안 조건, priorites[idx] == q.peek() 일 시, poll 및 order ++, idx == locaton 일 시, order 반환
 */
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for(int x: priorities){
            q.add(x);
        }
        
        int order = 0;
        while(!q.isEmpty()){
            for(int i=0;i<priorities.length;i++){
                if(priorities[i] == q.peek()) {
                    q.poll();
                    order++;
                    if(i == location) return order;
                }
            }
        }
        return order;
    }
}