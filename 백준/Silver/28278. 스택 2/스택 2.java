import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); // 명령의 개수

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken()); // 명령 입력

            if (command == 1) {
                int x = Integer.parseInt(st.nextToken()); // 스택에 추가할 값
                stack.add(x);
            }
            else if (command == 2){
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            }
            else if (command == 3){
                System.out.println(stack.size());
            }
            else if (command == 4){
                System.out.println(stack.isEmpty() ? 1 : 0);
            }
            else if (command == 5){
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
        }
    }
}
