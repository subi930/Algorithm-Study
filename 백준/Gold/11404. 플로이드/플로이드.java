import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static int n; // 도시 갯수
    static int m; // 버스 갯수
    static int[][] distances;
    static final int INF = 10000000;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        distances = new int[n + 1][n + 1];

        initDistanceTable();

        for (int i = 0; i < m; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            int cost = sc.nextInt();
            distances[start][end] = Math.min(distances[start][end], cost);
        }

        floyd();
        print();
    }

    // 최단 거리 테이블 초기 생성
    static void initDistanceTable() {
        for (int i = 1; i <= n; i++) {
            Arrays.fill(distances[i], INF);
            distances[i][i] = 0;
        }
    }

    // 최단 경로 찾는 기능
    static void floyd() {
        for (int visit = 1; visit <= n; visit++) {
            for (int start = 1; start <= n; start++) {
                for (int end = 1; end <= n; end++) {
                    if (distances[start][visit] != INF && distances[visit][end] != INF) {
                        distances[start][end] = Math.min(distances[start][end], distances[start][visit] + distances[visit][end]);
                    }
                }
            }
        }
    }

    // 최단거리 테이블 출력 기능
    static void print() {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (distances[i][j] == INF) {
                    System.out.print("0 ");
                } else {
                    System.out.print(distances[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
