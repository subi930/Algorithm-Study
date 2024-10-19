import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
       
        for(String o : operations){
            String[] st = o.split("\\s");
            if(st[0].equals("I")) {
                int value = Integer.valueOf(st[1]);
                pq1.add(value);
                pq2.add(value);
            }
            else if(st[0].equals("D")) {
                if(pq1.isEmpty()) continue;
                else if(st[1].equals("1")){
                    int max = pq2.poll();
                    pq1.remove(max);
                }
                else if(st[1].equals("-1")){
                    int min = pq1.poll();
                    pq2.remove(min);
                }
            }
        }

        if(!pq1.isEmpty()) {
            answer[0] = pq2.peek();
            answer[1] = pq1.peek();
        }
        
        return answer;
    }
}