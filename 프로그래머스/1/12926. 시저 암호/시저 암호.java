// 1. String을 char 배열로 변환하여 모든 문자 요소에 변화를 적용시킨다.
// 2. 문자의 길이만큼 for반복문을 실행하여, 문자요소에 n만큼 더한다.
// 3. 공백 일 시에는 각각 변경을 생략한다.
// 4. 대문자, 소문자 별로 n을 더한 수가 알파벳 순서로 몇인지 구하고, 이를 알파벳갯수만큼 나눈 나머지를 각각 'A' 혹은 'a'에 더한다.
// 4. 바꾼 배열을 다시 문자열로 변환한다.
class Solution {
    public String solution(String s, int n) {
        char[] charS = s.toCharArray();

        for(int i = 0; i < charS.length; i++) {
            if( charS[i] == ' ') continue;
            
            if (charS[i] >= 'a' && charS[i] <= 'z') {
                 charS[i] = (char) (( charS[i]+ n - 'a') % 26 + 'a');
            } 
            else if (charS[i] >= 'A' && charS[i] <= 'Z') {
                 charS[i] = (char) ((charS[i] + n - 'A') % 26 + 'A');
            }
            
        }

        String answer = new String(charS);
        return answer;
    }
}