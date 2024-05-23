import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    Integer num=sc.nextInt();

    Integer[] set=new Integer[10];
    Arrays.fill(set,0);

    // while 반복문을 이용해, num의 나머지를 같은 값의 set 배열의인덱스 자리에 넣는다.
    Integer remain;
    while(num!=0){
      remain=num%10;
      set[remain]++;
      num/=10;
    }

    // 6,9는 두 수로 사용할 수 있으니, 필요 세트의 갯수가 ( 자릿수 합 +1 )/2 의 값과 같다.
    set[6]=(set[6]+set[9]+1)/2;
    set[9]=set[6];

    // 각 자릿수의 필요 세트 수의 최댓값이 필요한 세트의 개수 최솟값이다.
    Integer max=0;
    for(int i=0;i<10;i++){
      if(max<set[i]) max=set[i];
    }
    System.out.println(max);
  }
}