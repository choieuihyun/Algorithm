package project.middleTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

// 문제: 연산자 배치 (실버 1, 삼성 기출 계열)
// 문제 설명
// 1부터 N까지의 수를 한 줄로 나열하는데, 인접한 두 수의 차이가 항상 K 이하가 되도록 하는 경우가 몇 가지인지 구하라.
// 입력
// 첫째 줄에 N과 K가 공백으로 주어진다. (1 ≤ N ≤ 8, 1 ≤ K ≤ 7)
// 출력
// 조건을 만족하는 나열의 개수를 출력한다.
// 예제 입력 1
// 3 1
// 예제 출력 1
// 2
// 설명: 1,2,3을 나열하는 모든 경우 중 인접 차이가 1 이하인 건:
// 1 2 3 (차이 1, 1) ✅
// 2 1 ... 2 3 시작... 직접 세봐
// 3 2 1 (차이 1, 1) ✅
// → 2가지
// 예제 입력 2
// 4 2
// 예제 출력 2
// 12

// 이게 순열인지 조합인지부터 판단을 해야하는데
// 123, 321 둘 다 허용되는 것을 보아하니 순열이지.
// 순열은 visited로 걸러주고, 조합은 backtrack에서 start를 파라미터로 사용해서 +1씩 해가면서 이전껄 빼버린다.
public class OperatorPlacement_samsung {

    static int N;
    static int K;
    static int[] numbers;
    static boolean[] visited;
    static int answer;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        answer = 0;

        numbers = new int[N];
        visited = new boolean[N];

        backtrack(0);
        
        System.out.println(answer);
    }

    // count가 뎁스임. 어디까지 들어가는지를 정한다.
    static void backtrack(int count) {
        // 조건을 만족하는 갯수를 출력하라 --> 조건 만족 시 answer++ --> 조건을 만족한다 == count가 끝까지 들어가서 모두 탐색했다.
        if (count == N) {
            answer++;
            return;
        }

        for (int i = 1; i <= N; i++) {

            if (visited[i-1])
                continue;

            // numbers의 현재 위치에서 다음위치를 뺐을 때
            if (count > 0 && Math.abs(numbers[count-1] - i) > K)
                continue;

            visited[i-1] = true;
            numbers[count] = i;
            backtrack(count+1);
            visited[i-1] = false;

       }
    }

}
