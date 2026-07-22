import java.util.*;

public class day10_house {
    static int N;
    static int[][] house;
    static boolean[][] visited;
    static int count = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        // 집 단지 수를 체크할 count, 집 단지 수를 오름차로 출력할 리스트가 필요
        ArrayList<Integer> countList = new ArrayList<>();

        // 초기화까진 했고..
        house = new int[N][N];
        visited = new boolean[N][N];

        // dfs를 2차원 배열 내 모든 지역에서 돌려보지 않을까?
        // 배열에서 인접한 지역이 1일 경우 count++ 이겠지, 집이 있다는 뜻이니까.
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 시작점에서 카운트 초기화 해줘야하지 않나
                // 그리고 인접한 단지를 찾는거라 근처가 1일 경우에만 수행하고 0이면 안해야지.
                if (house[i][j] == 1 && !visited[i][j]) {
                    count = 0;
                    dfs(i, j);
                    countList.add(count);
                }
            }
        }

        Collections.sort(countList);

        for(int i : countList) {
            System.out.println(i);
        }
    }

    // dfs는 row, column이 거의 들어가나?
    static void dfs(int row, int column) {
        // 방문처리 해주고, 찍었잖아.
        visited[row][column] = true;

        // 상하좌우 이동은 이렇게 할꺼야.
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        // 보통 dfs나 bfs나 dr,dc 하고 nr, nc 만들어서 그 지점으로 다시 dfs(nr, nc) or bfs(nr, nc) 한단 말이지
        for (int i = 0; i < 4; i++) {
            // nr, nc를 어떻게 만들어야하더라? 이거 아닌거 같은데
            // nr, nc가 dfs에 들어갈 다음 행 열인데
            int nr = row + dr[i];
            int nc = column + dc[i];

            // new int로 배열 인덱스 하나 빼와서 찾는건 bfs에서 하는거고
            // nr, nc 범위를 결정하고 보통 visited 체크하고 문제마다 다른 요소를 체크하는데
            // 이 인접 문제 같은 경우 1(house)끼리 붙어있는 경우에 이동을 해서 dfs를 갈겨야 하는 문제이기 때문에 house[nr][nc] == 1 경우를 걸어준다?
            if (nr >= 0 && nr < N && nc >= 0 && nc < N
                 && !visited[nr][nc] && house[nr][nc] == 1)
            ) {
                count++;
                // dfs를 해주는데
                dfs(nr, nc);
            }
        }
    }
}
