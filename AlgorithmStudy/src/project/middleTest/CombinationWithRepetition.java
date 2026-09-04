package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제: 중복 조합 (Combination with Repetition)
// 문제 설명
// 자연수 N과 M이 주어질 때, 1부터 N까지의 자연수 중에서 M개를 고른 수열을 모두 구하라.
// 같은 수를 여러 번 골라도 된다. 단, 고른 수열은 비내림차순(같거나 커지는 순서)이어야 한다.
// 입력
// 첫째 줄에 N과 M이 공백으로 주어진다. (1 ≤ M ≤ N ≤ 8)
// 출력
// 한 줄에 하나씩, M개의 수를 공백으로 구분해 출력한다.
// 사전순으로 출력한다.
// 예제 입력
// 3 2
// 예제 출력
// 1 1
// 1 2
// 1 3
// 2 2
// 2 3
// 3 3

public class CombinationWithRepetition {

    static int N;
    static int M;
    static int[] picked;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        picked = new int[M];

        // 카운트는 1부터 할 필요가 없지 멍청아.
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

        // N == 3, M == 2
        for (int i = start; i <= N; i++) {
            picked[count] = i;
            backtrack(i+1, count+1);
        }
    }
}
