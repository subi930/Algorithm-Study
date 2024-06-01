// 1. 최저점수 알아내기
//  1-1. sort() 함수를 통해 오름차순으로 정렬한다.
//  1-2. 정렬된 배열의 (score.length - m*n)번째 인덱스의 값이 n번째 상자의 최저점수이다.
// 2. answer += n번째 상자의 최저점수 * 사과 갯수, n * m < = 사과갯수    
import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        for( int i = score.length - m; i >= 0 ;i-=m ) {
            answer += score[i] * m;
        }
        return answer;
    }
}