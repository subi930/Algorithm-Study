import java.util.ArrayList;
import java.util.List;
class Solution {
    public List solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
        int[] ans1 = new int[answers.length];
        int[] ans2 = new int[answers.length];
        int[] ans3 = new int[answers.length];

        int[] ansCount = new int[]{0, 0, 0};

        for(int i =0;i<answers.length;i++){
            // ans1
            if((i+1)%5==1) ans1[i] = 1;
            if((i+1)%5==2) ans1[i] = 2;
            if((i+1)%5==3) ans1[i] = 3;
            if((i+1)%5==4) ans1[i] = 4;
            if((i+1)%5==0) ans1[i] = 5;

            if(answers[i] == ans1[i]) ansCount[0]++;

            // ans2
            if((i+1)%8==1) ans2[i] = 2;
            if((i+1)%8==2) ans2[i] = 1;
            if((i+1)%8==3) ans2[i] = 2;
            if((i+1)%8==4) ans2[i] = 3;
            if((i+1)%8==5) ans2[i] = 2;
            if((i+1)%8==6) ans2[i] = 4;
            if((i+1)%8==7) ans2[i] = 2;
            if((i+1)%8==0) ans2[i] = 5;

            if(answers[i] == ans2[i]) ansCount[1]++;

            // ans3
            if((i+1)%10==1) ans3[i] = 3;
            if((i+1)%10==2) ans3[i] = 3;
            if((i+1)%10==3) ans3[i] = 1;
            if((i+1)%10==4) ans3[i] = 1;
            if((i+1)%10==5) ans3[i] = 2;
            if((i+1)%10==6) ans3[i] = 2;
            if((i+1)%10==7) ans3[i] = 4;
            if((i+1)%10==8) ans3[i] = 4;
            if((i+1)%10==9) ans3[i] = 5;
            if((i+1)%10==0) ans3[i] = 5;

            if(answers[i] == ans3[i]) ansCount[2]++;

        }

        int maxCount = 0;
        for(int i : ansCount){
            maxCount = Math.max(maxCount,i);
        }


        for(int i =0;i<3;i++){
            if(ansCount[i]==maxCount){
                answer.add(i+1);
            }
        }

        return answer;
    }
}