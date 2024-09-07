import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String s =""; // 문자열 s
        s += a;
        s += b;
        int sum = Integer.parseInt(s); // 문자열의 합을 정수로 변환

        System.out.println(a+b-c);
        System.out.println(sum-c);
    }
}