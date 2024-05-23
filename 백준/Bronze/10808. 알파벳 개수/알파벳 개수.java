import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int[] alphabet_count= new int[26];
        Arrays.fill(alphabet_count,0);

        for(int i=0;i<s.length();i++){
            int a= s.charAt(i)-'a';
            alphabet_count[a]++;
        }

        for(int i=0;i<alphabet_count.length;i++){
            System.out.print(alphabet_count[i]+ " ");
        }

    }
}
