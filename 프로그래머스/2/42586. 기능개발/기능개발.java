import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public List solution(int[] progresses, int[] speeds) {
        Queue<Integer> periods = new LinkedList<>();
        List<Integer> answers = new ArrayList<>();

        for(int i= 0 ; i< progresses.length ; i++){
            Integer period = (100-progresses[i])/speeds[i];
            if((100-progresses[i])%speeds[i]>0) period++;

            periods.add(period);
        }

        Integer a = periods.poll();
        Integer ans = 1;
        while(true){
            if(periods.peek()<=a) {
                ans++;
                periods.poll();
            }
            else {
                answers.add(ans);
                ans = 1;
                a = periods.poll();
            }
            if(periods.isEmpty()) {
                answers.add(ans);
                break;
            }
        }

        return answers;

    }
}