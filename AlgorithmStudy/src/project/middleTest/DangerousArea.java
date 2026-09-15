package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.StringTokenizer;

// 문제: 안전 거리 (Safe Distance)
// 문제 설명
// N×M 격자가 주어진다. 각 칸은 1(위험 지역) 또는 0(안전 지역)이다.
// 각 안전 지역(0)에 대해, 가장 가까운 위험 지역까지의 거리를 구한다. 거리는 상하좌우로 이동한 횟수다. (대각선 X)
// 모든 안전 지역 중 가장 먼 거리를 출력하라.
// 입력
// 첫째 줄에 N과 M이 공백으로 주어진다. (1 ≤ N, M ≤ 100)
// 둘째 줄부터 N줄에 걸쳐 격자 정보가 공백으로 구분되어 주어진다.
// 위험 지역(1)은 최소 하나 이상 존재한다.
// 출력
// 안전 지역 중 가장 가까운 위험 지역까지의 거리가 최대인 값을 출력한다.
// 안전 지역이 하나도 없으면 0을 출력한다.
// 예제 입력 1
// 3 4
// 1 0 0 0
// 0 0 0 0
// 0 0 0 1
// 예제 출력 1
// 3
public class DangerousArea {
    static int N;
    static int M;
    static int[][] map;
    static boolean[][] visited;
    static int[][] dist;
    static ArrayDeque<int[]> queue;
    static int answer = 0; // 최대 거리를 계속 비교하기위한 정답 값
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];
        dist = new int[N][M];
        queue = new ArrayDeque<>();
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                
                // 0이 아니라 1일때 해야하는구나
                if (map[i][j] == 1) {
                    // 여기서 초기 값 queue에 다 삽입하고
                    queue.offer(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }

        bfs();


        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.println(dist[i][j]);
                answer = Math.max(answer, dist[i][j]);
            }
        }
        
        System.out.println(answer);
    }

    // 그럼 얘도 dfs 한번 돌 때 마다 size를 늘려주면 되는 것 같은데.
    static void bfs() {
        
        // 다음 이동 범위 체크
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // while문으로 queue가 빌 때까지 체크
        while(!queue.isEmpty()) {

            // main문에서 queue에 넣었으니까
            int[] current = queue.poll();
            // 현재 인덱스 파악하고
            int cr = current[0];
            int cc = current[1];

            for (int i = 0; i < 4; i++) {
                int nr = cr + dr[i];
                int nc = cc + dc[i];

                if (nr >= 0 && nr < N && nc >= 0 && nc < M &&
                    !visited[nr][nc] && map[nr][nc] == 0
                ) {
                    visited[nr][nc] = true;
                    dist[nr][nc] = dist[cr][cc] + 1;
                    // 조건에 부합하면 다음 인덱스를 queue의 다음 작업에 넣어주는거지.
                    queue.offer(new int[]{nr, nc});
                    
                    
                }
            }
        }
    }
}
