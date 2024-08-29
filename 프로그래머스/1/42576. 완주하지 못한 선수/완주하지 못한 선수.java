import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String,Integer> completionTable = new HashMap<>();

        for( String x: completion) {
            if(!completionTable.containsKey(x)) completionTable.put(x,1);
            else {
                completionTable.replace(x,completionTable.get(x)+1);
            }
        }

        for(String x : participant) {
            if(!completionTable.containsKey(x) || completionTable.get(x) == 0) {
                answer = x;
                break;
            }
            else {
                completionTable.replace(x,completionTable.get(x)-1);
            }
        }
        return answer;
    }
}