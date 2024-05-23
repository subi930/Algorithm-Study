import java.util.*;

public class Main {
  public static void main(String[] args) {
    // Scanner 클래스 선언
    Scanner sc=new Scanner(System.in);
    
    //Integer A,B,C, 세 수의 곱인 Sum 선언 
    Integer A,B,C,Sum=0;
    
    //Sum의 숫자별로 자릿수를 세는 Integer 배열 Numcount 선언 및 각 배열 요소 0 초기화
    Integer[] NumCount=new Integer[10];
    Arrays.fill(NumCount,0);
    
    // A,B,C 입력
    A=sc.nextInt();
    B=sc.nextInt();
    C=sc.nextInt();

    //Sum 구하기
    Sum=A*B*C;
    
    // While 반복문 이용, 각 자릿수를 세는 반복문 코드 실행
    Integer remain=0;
    while(Sum!=0){
      remain=Sum%10;
      NumCount[remain]++;
      Sum/=10;
    }

    for(int i=0;i<10;i++){
      System.out.println(NumCount[i]);
    }
  }
}
