import java.util.Arrays;

class Solution {
    int V;  // 정점
    int[][] edges;   // 노드 - 간선정보
    int[][] distanceTable;    // FW를 위한 2차원 최단거리 테이블
    
    public int solution(int n, int[][] results) {
        int answer = 0;
        this.V = n;
        this.edges = results;
        distanceTable = new int[V + 1][V + 1];
        
        initDistanceTable();
        findAll();

        for (int i = 1; i <= V; i++) {
            int count = 0;
            for (int j = 1; j <= V; j++) {
                if (i != j && (distanceTable[i][j] != Integer.MAX_VALUE || distanceTable[j][i] != Integer.MAX_VALUE)) {
                    count++;
                }
            }
            if (count == V - 1) {
                answer++;
            }
        }
        
        return answer;
    }
    
    private void initDistanceTable() {
        for (int i = 1; i <= V; i++) {
            Arrays.fill(distanceTable[i], Integer.MAX_VALUE);
            distanceTable[i][i] = 0;
        }
        for (int[] edge : edges) {
            int start = edge[0];
            int end = edge[1];
            distanceTable[start][end] = 1;
        }
    }

    // 최단 경로 찾는 기능 - 플로이드-와샬 알고리즘
    private void findAll() {
        for (int k = 1; k <= V; k++) {
            for (int i = 1; i <= V; i++) {
                for (int j = 1; j <= V; j++) {
                    if (distanceTable[i][k] != Integer.MAX_VALUE && distanceTable[k][j] != Integer.MAX_VALUE) {
                        distanceTable[i][j] = Math.min(distanceTable[i][j], distanceTable[i][k] + distanceTable[k][j]);
                    }
                }
            }
        }
    }
}
