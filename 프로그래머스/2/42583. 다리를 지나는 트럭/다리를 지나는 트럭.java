import java.util.LinkedList;
import java.util.Queue;

class Solution {
    class Truck {
        int weight;
        int move;

        public Truck(int weight) {
            this.weight = weight;
            this.move = 1;
        }
        public void moving() {
            move++;
        }
    }
    
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        int time = 0;
        int bridge_weight = 0;

        Queue<Truck> waitingQueue = new LinkedList<>();
        Queue<Truck> movingQueue = new LinkedList<>();

        for(int t : truck_weights) {
            waitingQueue.add(new Truck(t));
        }

        while(!(waitingQueue.isEmpty() && movingQueue.isEmpty())) {
            time++;

            if(movingQueue.isEmpty()){
                Truck t = waitingQueue.poll();
                bridge_weight+=t.weight;
                movingQueue.add(t);
                continue;
            }

            for(Truck t : movingQueue){
                t.moving();
            }

            if(movingQueue.peek().move > bridge_length) {
                Truck t =  movingQueue.poll();
                bridge_weight -= t.weight;
            }

            if(!waitingQueue.isEmpty() && bridge_weight + waitingQueue.peek().weight <= weight){
                Truck t = waitingQueue.poll();
                bridge_weight += t.weight;
                movingQueue.add(t);

            }

            
        }
        return time;

    }
}