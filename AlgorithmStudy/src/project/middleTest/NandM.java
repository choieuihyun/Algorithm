package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 🧩 문제: N과 M (2)
// 문제 설명
// 자연수 N과 M이 주어질 때, 1부터 N까지의 자연수 중에서 중복 없이 M개를 고른 수열을 모두 구하라.
// 단, 고른 수열은 오름차순이어야 한다.
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
// 2 3
// 2 4
// 3 4
public class NandM {
    static int N;
    static int M;
    static StringBuilder sb = new StringBuilder();
    static int[] nums;
    static int[] picked;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        nums = new int[N];
        picked = new int[M];

        backtrack(1, 0);

        System.out.println(sb);
    }

    static void backtrack(int start, int count) {
        if (count == M) {
            for (int i : picked) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        // 이게 lottoNumber.java에서는 왜 nums[i]를 쓰고, 여기서는 i를 썼냐.
        // 이 문제의 경우는 1~4까지 순서대로 1,2,3,4를 사용하는데
        // lottoNumber.java는 1 2 3 4 5 6 7이 아니라 1 5 22 33 54 88 이런식으로 나올 수 있어서
        // i를 순서대로 못쓴다.
        for (int i = start; i < N; i++) {
            picked[count] = i;
            backtrack(i + 1, count + 1);
        }
    }
}
