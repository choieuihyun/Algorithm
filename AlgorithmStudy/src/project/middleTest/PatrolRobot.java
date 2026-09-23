package project.middleTest;

public class PatrolRobot {
    static int N;
    static int M;
    public static void main(String[] args) {

    }

    public int patrolRobotSolution(String[] grid, String[] commands) {
        
        // dr, dc를 구현해야하고
        // 방향이 있으니 방향을 설정해야하고
        // 로봇은 왼쪽, 오른쪽 90도 회전을 하며 바라보는 방향으로 k칸 전진
        // 이게 90도 회전이라 이렇게 해야하는걸로 아는데 북, 서, 남, 동 아무튼 90도로 돌긴 하니까
        int[] dr = {-1, 0, 1, 0};
        int[] dc = {0, -1, 0, 1};

        int r = 0;
        int c = 0;
        // 북쪽을 보고있다고 했고 dr 세팅을 저렇게 했기 때문에.
        int direction = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length(); j++) {
                if (grid[i].charAt(j) == 'S') {
                    r = i;
                    c = j;
                }
            }
        }

        for (int i = 0; i < commands.length; i++) {
            char command = commands[i].charAt(i);
            switch (command) {
                case 'F':
                    
                    break;
                case 'R':
                    direction = (direction + 3) % 4;
                    break;
                case 'L':
                    direction = (direction + 1) % 4;
                    break;
                default:
                    break;
            }
        }

        return 0;
    }
}
