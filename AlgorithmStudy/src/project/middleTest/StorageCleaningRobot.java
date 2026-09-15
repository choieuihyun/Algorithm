package project.middleTest;

import java.util.Scanner;

// [COS Pro 1급 · 유형 2 — 함수 구현] 창고 정리 로봇
// 물류창고를 N × N 격자로 표현한다. 2차원 배열 board의 각 칸은 다음 중 하나다.
// 0 : 빈 칸
// 1 : 벽
// 2 : 상자
// 로봇은 항상 (0, 0)에서 **동쪽(오른쪽)**을 바라본 채 아무것도 들지 않은 상태로 시작한다. (0, 0)은 항상 빈 칸이다.
// 문자열 commands의 문자를 앞에서부터 순서대로 수행한다.
// 명령	동작
// F	바라보는 방향으로 한 칸 전진. 단, 격자 밖이거나 **벽(1)**이면 이동하지 않고 제자리 (방향은 유지)
// L	제자리에서 왼쪽으로 90도 회전
// R	제자리에서 오른쪽으로 90도 회전
// P	현재 칸에 상자가 있고 로봇이 아무것도 안 들고 있으면 상자를 집는다 → 그 칸은 빈 칸이 된다. 조건이 안 맞으면 아무 일도 없다
// D	로봇이 상자를 들고 있고 현재 칸이 빈 칸이면 상자를 내려놓는다 → 그 칸은 상자 칸이 된다. 조건이 안 맞으면 아무 일도 없다
// 주의: 상자가 있는 칸(2)은 벽이 아니므로 로봇이 이동해 들어갈 수 있다. 막는 건 벽과 격자 경계뿐이다.
// 모든 명령을 수행한 뒤, 격자에 놓여 있는 상자들의 (행 + 열) 값을 전부 더한 값을 return 하시오. 마지막에 로봇이 들고 있는 상자는 세지 않는다.
// 제한사항
// 2 ≤ N ≤ 100
// commands의 길이는 1 이상 1,000 이하이며 F, L, R, P, D로만 구성된다.
// 입출력 예
// 예제 1
// board = {{0,0,2,0},
//          {0,1,0,0},
//          {0,0,0,0},
//          {2,0,0,0}}
// commands = "FFPRRFFD"
// return = 3
// (0,0)→(0,1)→(0,2)에서 상자를 집고, R R로 서쪽을 본 뒤 (0,0)까지 돌아와 내려놓는다.
// 최종 상자 위치는 (0,0)과 (3,0) → 0 + 3 = 3

public class StorageCleaningRobot {

    public static void main(String[] args) {

    }

    int solution(int[][] storage, String commands) {
        int answer = 0;

        // 동남서북
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};

        int r = 0;
        int c = 0;
        int direction = 0;
        boolean holding = false;

        for (int i = 0; i < commands.length(); i++) {
            int command = commands.charAt(i);

            switch (command) {
                case 'F':
                    int nr = r + dr[direction];
                    int nc = c + dc[direction];

                    if ((nr >= 0 && nr < storage.length && nc >= 0 && nc < storage.length)) {
                        if (storage[nr][nc] != 1) {
                            r = nr;
                            c = nc;
                        }
                    }
                    break;            
                case 'L':
                    direction = (direction + 3) % 4;
                    break;            
                case 'R':
                    direction = (direction + 1) % 4;
                    break;            
                case 'P':
                    if (storage[r][c] == 2 && holding == false) {
                        storage[r][c] = 0;
                        holding = true;
                    }
                    break;                       
                case 'D':
                    // 로봇이 상자를 들고 있고 현재 칸이 빈 칸이면 상자를 내려놓는다.
                    if (holding == true && storage[r][c] == 0) {
                        storage[r][c] = 2;
                        holding = false;
                    }
                    break;                    
                default:
                    break;
            }
        }

        return answer;
    }
}
