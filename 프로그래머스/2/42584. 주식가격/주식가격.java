class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int sec = 0;
        for(int i = 0 ; i < prices.length ; i ++) {
            sec = 0;
            for(int j = i+1; j < prices.length; j++) {
                if(prices[i]>prices[j]) {
                    sec = j-i;
                    break;
                }
                else sec++;
            }
            answer[i] = sec;
        }
        return answer;
    }
}