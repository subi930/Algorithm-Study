import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer k = Integer.parseInt(br.readLine());
        Integer sum = 0;
        Integer num;
        for(int i = 0; i < k ; i++){
            num = Integer.parseInt(br.readLine());
            if(num == 0 ) stack.pop();
            else stack.add(num);
        }

        while(!stack.isEmpty()) sum += stack.pop();

        System.out.println(sum);
    }
}