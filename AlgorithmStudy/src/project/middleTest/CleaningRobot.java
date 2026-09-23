package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CleaningRobot {
    
    static int N;
    static int M;
    static int[][] map;
    static boolean[][] cleaned;
    static int clean = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        cleaned = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, 1, 0, -1};

        while (true) {

            if (!cleaned[r][c]) {
                cleaned[r][c] = true;
                clean++;
            }

            boolean hasDirty = false;
            for (int i = 0; i < 4; i++) {
                // 첫번째 받은 방향으로 다음 행,열 계산
                int nr = r + dr[i];
                int nc = c + dc[i];

                // 빈칸(0)이고, 맵 내부여야하고, 청소가 안된 경우
                if (map[nr][nc] == 0 
                    && nr < N && nr >= 0
                    && nc < M && nc >= 0
                    && !cleaned[nr][nc]
                ) {
                    hasDirty = true;
                    break;
                }
            }

            // 위에서 청소가 안되어서 내려왔을 경우
            if (!hasDirty) {
                int backR = r - dr[d];
                int backC = c - dc[d];

                if (map[backR][backC] == 1) {
                    break;
                }

                r = backR;
                c = backC;
            } else {
                d = (d + 1) % 4;
                int nr = r + dr[d];
                int nc = c + dc[d];
                if (nr < N && nr >= 0
                    && nc < M && nc >= 0
                ) {
                    r = nr;
                    c = nc;
                }
            }
        }
    }
}
