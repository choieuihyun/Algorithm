package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 🧩 문제: N과 M (1)
// 문제 설명
// 자연수 N과 M이 주어질 때, 1부터 N까지의 자연수 중에서 중복 없이 M개를 고른 수열을 모두 구하라.
// 이번엔 순서가 다르면 다른 수열로 친다. (1 2와 2 1은 서로 다름)
// 입력
// 첫째 줄에 N과 M이 공백으로 구분되어 주어진다. (1 ≤ M ≤ N ≤ 8)
// 출력
// 한 줄에 하나씩, M개의 수를 공백으로 구분해 출력한다.
// 사전순으로 출력한다.
// 예제 입력
// 4 2
// 예제 출력
// 1 2
// 1 3
// 1 4
// 2 1
// 2 3
// 2 4
// 3 1
// 3 2
// 3 4
// 4 1
// 4 2
// 4 3
// 아까랑 뭐가 다른지 봐
// 방금 N과 M (2)는 1 2만 있고 2 1은 없었지? 이번엔 2 1도 나와. 순서까지 구분하는 순열이야.
public class NandM_Second {
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static int[] picked;
    static boolean[] visited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        picked = new int[M];
        visited = new boolean[N+1];

        // 이렇게 4를 입력했을 때 순차적으로 1,2,3,4를 사용할 경우.
        // start에 0을 넣어주면 숫자를 0부터 시작하니까 1로 바꿔주는게 좋다.
        backtrack(0);

        System.out.println(sb);
    }

    // 이미 계산한 내용은 건너가되, 중복은 허용시켜야한다?
    static void backtrack(int count) {
        if (count == M) {
            for (int i : picked) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = 1; i <= N; i++) {
            // 방문한 곳이면 패스하고
            if (visited[i]) {
                continue;
            }
            // 방문했다고 해주고
            visited[i] = true;
            // 고른곳에 1,2,3,4 순서대로 넣어주고
            picked[count] = i;
            // i랑 count만 동적으로 움직인다.
            // 근데 여기서 i+1, count+1로 하면 자연스럽게 중복제거가 되니까
            // 방문했다고 체크한 상태로 백트래킹 넘기고
            backtrack(count + 1);
            // 방문 안했다고 초기화 해줘서 다시 체크 가능하게하고
            visited[i] = false;
        }
    }
}
