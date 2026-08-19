package project.middleTest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

// 🧩 문제: 로또 번호 조합
// 문제 설명
// 서로 다른 자연수 K개가 주어진다. 이 K개 중에서 6개를 고르는 모든 경우를 구하라.
// 숫자는 오름차순으로 정렬되어 주어지고, 각 조합도 오름차순으로 출력한다.
// 입력
// 첫째 줄에 K와 K개의 수가 공백으로 구분되어 주어진다.
// (6 < K < 13, 입력은 오름차순)
// 출력
// 6개를 고른 모든 조합을 사전순으로 출력한다.
// 각 조합의 숫자는 공백으로 구분한다.
// 예제 입력
// 7 1 2 3 4 5 6 7
// 예제 출력
// 1 2 3 4 5 6
// 1 2 3 4 5 7
// 1 2 3 4 6 7
// 1 2 3 5 6 7
// 1 2 4 5 6 7
// 1 3 4 5 6 7
// 2 3 4 5 6 7
// 조건 정리
// K개 중에서 6개 선택 (조합)
// 입력은 이미 오름차순
// 사전순(작은 것부터) 출력
// 뽑은 6개는 공백으로 구분해서 한 줄에
// 힌트
// 이건 그래프 아니고 재귀 백트래킹이야. 아까 DFS 재귀 짜던 감각 그대로 쓰면 돼.
// 생각할 포인트:
// "지금 몇 개 뽑았나" (6개 되면 출력하고 끝)
// "어디서부터 고를 수 있나" (이미 고른 것 다음 번호부터 → 중복/순서 방지)
// 뽑았다가 다시 빼는 선택/취소 구조

// 순열, 조합은 백트래킹
// 최단거리, 최단횟수는 BFS(Queue에 넣어서 하는 원리, 항상 생각해보셈)
// 닿는지, 연결되는 갯수
public class lottoNumber {
    static int K; // 전체 숫자 갯수
    static int[] nums; // 입력받을 숫자들
    static int[] picked; // 뽑은 숫자들
    static StringBuilder sb = new StringBuilder();

    // BufferedReader랑 StringTokenizer에 대해 이해를 좀 하고 가야함.
    public static void main(String[] args) throws Exception {
        // 자.. 여기서 BufferedReader를 생성하고
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 여기서 StirngTokenizer에 BufferedReader에서 받아온 readLine()을 넣어서 쪼개는거야
        // 참고로 공백으로 문자가 나뉘어져있지 않고 1001011 이렇게 붙어있으면 그.. for문 사용해서 charAt(i) - '0' 이런식으로 쪼개서 해야한다.
        StringTokenizer st = new StringTokenizer(br.readLine());

        K = Integer.parseInt(st.nextToken());
        nums = new int[K];
        picked = new int[6];

        for (int i = 0; i < K; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        backtrack(0, 0);

        System.out.println(sb);
    }

    // start : 몇 번 인덱스부터 고를꺼냐, count : 지금까지 뽑은 갯수
    static void backtrack(int start, int count) {
        // 보니까 리턴치는 위치는 보통 로직 실행 전이니.. 여기서 count로 딱 6까지만 잡아야해.
        // 6개를 뽑는 것이잖아. 그리고 그걸 세는건 count가 될꺼야.
        // 그리고 문제를 보면 6일때 무엇을 하라고 했냐.. 출력을 하라했지 뽑은애들꺼
        if (count == 6) {
            for (int i : picked) {
                sb.append(i).append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = start; i < K; i++) {
            picked[count] = nums[i];
            // 재귀를 돌아야하고, 종료 조건 걸었으니까 여기서 +1로 해줘야하는건 알겠어.
            backtrack(i + 1, count + 1);
        }
    }
}
