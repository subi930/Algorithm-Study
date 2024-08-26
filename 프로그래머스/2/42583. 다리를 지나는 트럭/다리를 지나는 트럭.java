import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int time = 0;
        int[] bridge = new int[bridge_length];
        Queue<Integer> trucks = new LinkedList<>();
        for(int x : truck_weights){
            trucks.add(x);
        }

        while(!trucks.isEmpty()){
            move(bridge);
            if(trucks.peek()+ sum(bridge) <= weight) {
                bridge[0] = trucks.poll();
            }
            time++;
        }

        while(sum(bridge)>0){
            move(bridge);
            time++;
        }
        
        return time;
    }

    static Integer sum(int[] arr){
        Integer sum = 0;
        for(int x : arr) {
            sum += x;
        }
        return sum;
    }

    static void move(int[] arr){
        for(int i = arr.length - 1 ; i >= 0; i --) {
            if (arr[i]==0) continue;
            if(i == arr.length - 1) arr[i] = 0;
            else {
                arr[i + 1] = arr[i];
                arr[i] = 0;
            }
        }
    }
}