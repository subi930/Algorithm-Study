class Solution {
    public String solution(String s, String skip, int index) {
        String answer="";
        // skipcount
        Integer count=0;
        
         // skipcount
        for(Integer i=0;i<s.length();i++){
            //  현재 검사할 s 요소 char 선언
            char CurrentCh=s.charAt(i);
            // CurrentCh가 넘어갈 count 수 = 0 초기화
            count=0;
            
            // count가 index의 값과 같아질 때까지 넘어가기
            while(count<index){
                // 넘어가기
                CurrentCh++;
                
                //넘어간 문자가 z를 넘어가면 a로 설정
                if(CurrentCh=='z'+1) CurrentCh='a';
                
                //반복문 이용, skip배열 요소와 비교
                //skip배열 요소와 일치하는 값이 없다면 count 증가
                for(Integer j=0;j<skip.length();j++){
                    if(skip.charAt(j)==CurrentCh) break;
                    if(j==skip.length()-1) count++;
                }
            }
          answer+=CurrentCh;
            
        }
        return answer;
    }
}