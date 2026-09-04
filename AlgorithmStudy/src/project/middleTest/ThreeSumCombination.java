package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제: 합이 특정 값이 되는 조합 (Three Sum Combination)
// 문제 설명
// N개의 서로 다른 정수가 주어진다. 이 중에서 3개를 골라 합이 특정 값 S가 되는 경우가 몇 가지인지 구하라.
// 입력
// 첫째 줄에 N과 S가 공백으로 주어진다. (3 ≤ N ≤ 20)
// 둘째 줄에 N개의 정수가 공백으로 주어진다. (각 정수는 1 이상 100 이하)
// 출력
// 3개를 골라 합이 S가 되는 조합의 개수를 출력한다.
// 예제 입력 1
// 5 15
// 2 3 5 7 8
// 예제 출력 1
// 2
// 설명: 2+5+8=15, 3+5+7=15 → 2개
// 예제 입력 2
// 6 12
// 1 2 3 4 5 6
// 예제 출력 2
// 7
// 설명: 1+2+...  직접 세봐 (1+5+6, 2+4+6, 3+4+5, 1+2+...  등)
// 조건 정리
// N개 중에서 3개 선택 (조합)
// 3개 합이 정확히 S인 경우만 카운트
// 몇 가지인지 개수만 출력 (조합 자체는 출력 X)

public class ThreeSumCombination {

    static int N;
    static int S;
    static int[] numbers;
    static int[] picked;
    static boolean[] visited;
    static int combinationCount = 0;
    static StringBuilder sb = new StringBuilder();

    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        numbers = new int[N];
        picked = new int[N];
        visited = new boolean[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        backtrack(0, 0);

        sb.append(combinationCount);

        System.out.println(sb);
    }

    // 내가 제일 헷갈리는게 뭐냐면 순열과 조합을 구분 못하는거였다
    // 순열은 순서를 따지기 떄문에 (2,1), (1,2)를 둘 다 뽑아내겠다.
    // 조합은 순서를 안따지기 때문에 (1,2), (2,1)을 동일시 하지.
    // 그렇다면 여기서 도출될 수 있는 결론은 아래와 같지.
    // 순열은 순서를 따지기 때문에 이전것도 포함해야 계속 찍어야하고, (1,1), (2,2)등은 제외해야함.
    // 그래서 count만 사용하고 visited[]를 사용해서 (1,1), (2,2) 이런것만 제외함.
    // 조합은 순서를 안따지기 때문에 (1,2), (2,1)이 동일 시 되어 start를 추가로 사용해서 이전껄 계산 안해버림
    static void backtrack(int start, int count) {

        // 여긴 그냥 말하는대로 구현하면 되는거고.
        if (count == 3) {
            int sum = picked[0] + picked[1] + picked[2];
            if (sum == S) {
                combinationCount++;
            }
            return;
        }

        // 조합은 이전꺼 체크를 안하니까 i = start;
        for (int i = start; i < numbers.length; i++) {
            // 고른 배열에 기존 숫자 배열에서 골라서 넣음
            picked[count] = numbers[i];
            
            // 백트랙으로 카운트만 ++, (1,3), (3,1) 등을 하려고
            backtrack(i+1, count+1);
        }
    }
}
