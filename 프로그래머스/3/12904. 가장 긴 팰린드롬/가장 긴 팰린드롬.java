class Solution
{
    public int solution(String s)
    {
        int answer = 0;


        for(int length = s.length();length>=1;length--){
            for(int sIdx = 0; sIdx<=s.length()-length;sIdx++){
                Boolean flag=true;
                int endIdx=length+sIdx-1;
                int startIdx = sIdx;
                while(endIdx>startIdx){
                    if(s.charAt(startIdx)!=s.charAt(endIdx)) {
                        flag=false;
                        break;
                    }
                    startIdx++;
                    endIdx--;
                }
                if(flag == true) {
                    answer = length;
                    return answer;
                }
            }
        }

        return answer;
    }
}