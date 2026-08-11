package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


// 🧩 문제: 단지 번호 붙이기
// 문제 설명
// N×N 크기의 지도가 주어진다. 각 칸은 다음 중 하나다.
// 1 : 집이 있는 칸
// 0 : 집이 없는 칸
// 상하좌우로 연결된 집들의 모임을 단지라고 한다. (대각선 X)
// 지도에 있는 단지의 수와, 각 단지에 속한 집의 수를 구하라.
// 입력
// 첫째 줄에 N이 주어진다. (5 ≤ N ≤ 25)
// 둘째 줄부터 N줄에 걸쳐 지도 정보가 주어진다. (공백 없이 숫자가 붙어서 주어짐)
// 출력
// 첫째 줄에 총 단지 수를 출력한다.
// 둘째 줄부터 각 단지 안의 집의 수를 오름차순으로 정렬해 출력한다.
// 예제 입력
// 7
// 0110100
// 0110101
// 1110101
// 0000111
// 0100000
// 0111110
// 0111000
// 예제 출력
// 3
// 7
// 8
// 9
// 조건 정리
// 단지 = 상하좌우로 연결된 1들의 덩어리 (대각선 X)
// 입력이 공백 없이 붙어서 들어옴 → 이거 어떻게 읽을지 생각해봐
// 단지 개수 + 각 단지의 집 개수 필요
// 집 개수는 오름차순 정렬해서 출력

public class houseNumber {

    static int N;
    static int [][] land;
    static boolean [][] visited;
    // houseInLandCount는 static으로 쓰던가 매개변수로 잘 넘겨서 쓰던가.
    // 자바가 Call by value라 그럼.
    static int houseInLandCount = 0;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        land = new int[N][N];
        visited = new boolean[N][N];

        int landCount = 0;
        ArrayList<Integer> houseInLandCountArray = new ArrayList<>();

        // land, map 등 표본 입력할 때 공백이 있고 없고에 따라 로직이 갈림.
        // 있으면 그냥 토크나이저로 잘라도 되는데 (토크나이저가 공백으로 자름)
        // 없으니까 String line = br.readLine() 으로 한 줄 씩 잘라서 처리.
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                land[i][j] = line.charAt(j) - '0';
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // 단지는 맞는데 방문하지 않았던 장소일 경우 landCount+1, dfs()
                if (land[i][j] == 1 && visited[i][j] == false) {
                    houseInLandCount = 0;
                    landCount += 1;
                    // dfs 한번 갔다오면 해당 단지는 다 visited 처리로 되어있음
                    dfs(i,j);
                    // dfs 한번 쭉 갔다와서 houseInLandCount 넣기.
                    houseInLandCountArray.add(houseInLandCount);
                }
                // 여기가 필요가 없대 어차피 dfs 돌리면 초기화돼서
                // else if (land[i][j] == 1) {
                //     houseInLandCountArray.add(houseInLandCount);
                //     houseInLandCount = 0;
                // }
            }
        }
        Collections.sort(houseInLandCountArray);

        System.out.println(landCount);

        for (int i : houseInLandCountArray) {
            System.out.println(i);
        }
        
    }

    static void dfs(int row, int column) {
        visited[row][column] = true;
        houseInLandCount += 1;
        // 여기서 로그 찍으면 houseInLandCount가 실제로 증가는 하는데
        // 왜 main문에서 찍으면 증가를 안하냐
        // 여기서 Math.max로 비교하면서 최댓값만 넣는건 이상하잖아.
        // 여기서 리턴치면서 하면 될 것 같은데 리턴 칠 조건이 없는데 여기는.. dist 써야하나? 그건 최단거리잖아.

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {
            int nr = row + dr[i];
            int nc = column + dc[i];

            // nr과 nc의 N, 0 경계는 그냥 외우고
            // 방문하지 않았던 곳도 가야하고
            // 단지에 집이 있는곳(1)만 가야하고
            if (nr < N && nr >= 0 && nc < N && nc >= 0
                && visited[nr][nc] != true && land[nr][nc] == 1
            ) {
                dfs(nr, nc);
            }
        }
    }
}
