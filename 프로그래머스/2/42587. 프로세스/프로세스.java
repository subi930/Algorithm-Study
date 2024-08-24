/*
[ArrayList 활용 풀이 ]
1. 리스트 원소 중 최댓값 원소를 max, max의 location 즉 인덱스 값을 maxLoctation이라 한다.
2. 입력한 location 값과 maxLocation 값이 같을 시, 반복을 중단하고 실행순서인 order를 반환한다.
3. location값과 maxLocation 값이 다를 시, max 값의 프로세스는 처리되었다 가정하고 0으로 원소 값을 수정한다.
4. 다음 max값을 찾기 위해 리스트 원소들의 max를 다시 구한다.
5. maxLocation 다음 인덱스부터 max값과 동일한 값을 구하기 위해 currentLocation 변수를 이용해 비교한다.
6. max값과 동일한 원소를 찾을 시, 해당 원소를 max, max의 인덱스를 maxLocation 으로 재선언한다.
7. 2번부터의 과정을 반복하며 답을 구한다. 
 */
import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        List<Integer> numbers = new ArrayList<>();
        for(int x : priorities) {
            numbers.add(x);
        }
        
        int max = Collections.max(numbers);
        int maxLocation = numbers.indexOf(max);

        int order = 1;

        while(true){
            if(maxLocation == location) {
                return order;
              
            }
            else {
                numbers.set(maxLocation,0);

                max = Collections.max(numbers);
                int currentLocation = maxLocation;

                while(max!=numbers.get(currentLocation)){
                    if(currentLocation == numbers.size() - 1) currentLocation = 0;
                    else currentLocation++;
                }
                maxLocation = currentLocation;
                order++;
            }
        }
    
    }
}