import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < cnt; i++) {
            String str = br.readLine();
            inspect(str);
        }
    }

    static void  inspect(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') stack.add(c);
            else if (stack.isEmpty()) {
                System.out.println("NO");
                return;
            } else stack.pop();
        }
        if (stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }
}