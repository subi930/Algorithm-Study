class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        long pNum = Long.parseLong(p);
        int pLength = p.length();
        int idx = 0;

        for( int i = 0; i <= t.length() - pLength; i++ ){
            String s = t.substring(i,i+pLength);
            long num = Long.parseLong(s);
            
            if( num <= pNum ) answer++;
        }
        
        return answer;
    }
    
}