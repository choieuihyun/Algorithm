package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ParcelRobot {
    static int N;
    static int M;
    static char[][] map;
    static int count = 0;
    static int parcel = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());

        map = new char[N][M];

        // 이거 들어올 때 map이 각 요소마다 공백이 없어서 st.nextToken으로
        // 한방에 for문 안에서 하려고 하면 NoSuchElementException 뜸
        for (int i = 0; i < N; i++) {
            String command = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = command.charAt(j);
            }
        }

        st = new StringTokenizer(br.readLine());
        String commands = st.nextToken();

        int[] dr = {1, -0, -1, 0};
        int[] dc = {0, 1, 0, -1};

        // direction은 0,1,2,3 늘어나면서 동서남북을 정한다.
        // 여기가 초기 값이 아니라 그.. 초기 d값을 이걸로 해줘야하네
        int direction = d;

        for (int i = 0; i < commands.length(); i++) {
            char command = commands.charAt(i);

            switch (command) {
                case 'L':
                    // 왼쪽으로 가는 곳에선 판별이 필요할 것이구
                    // 시계방향 90도는 반시계 270도와 같다.
                    // 왼쪽으로 90도 회전이니까 동남서북에서 -1로 가면 북쪽 맞지.
                    direction = (direction + 3) % 4;
                    break;
                case 'R':
                    direction = (direction + 1) % 4;
                    break;
                case 'F':
                    int nr = r + dr[direction];
                    int nc = c + dc[direction];

                    // 다음 공간이 벽이거나, 격자 밖일 경우 충돌 카운트 추가
                    if ((nr < 0 && nr >= N && nc < 0 && nc >= M) && (map[nr][nc] == '#')) {
                        count++;
                        direction = (direction + 1) % 4;
                    } else if (map[nr][nc] == '.') {
                        r = nr;
                        c = nc;
                    } else if (map[nr][nc] == '*') {
                        map[nr][nc] = '.';
                        parcel++;
                        r = nr;
                        c = nc;
                    }
                    break;
                default:
                    break;
            }
        }

        System.out.println(parcel);
        System.out.println(count);
        System.out.print(r + " " + c + " " + direction);
    }
}
