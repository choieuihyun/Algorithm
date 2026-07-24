

/* 
    N일 동안 프로젝트를 진행해요. 1일차부터 N일차까지예요. 시작 요일과 공휴일 목록이 주어질 때 실제 근무일수를 구하세요.

    토요일, 일요일은 무조건 휴무
    공휴일도 휴무 (주말과 겹쳐도 상관없음)
    나머지는 근무일

    입력
    14 2
    MON
    3 7

    N=14 (1일차~14일차)
    시작 요일: MON (1일차가 월요일)
    공휴일: 3일차, 7일차

    출력
    8
*/
package project.middleTest;

import java.util.*;
public class holiday_calcul {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력 값은 전부 생성
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        String day = scanner.next();
        String[] days = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};
        Set<Integer> holidays = new HashSet<>();

        for (int i = 0; i < K; i++) {
            int holiday = scanner.nextInt();
            holidays.add(holiday);
        }

        // 이제 체크해야하는건.. 프로젝트 기간 내에서 제외하면서 카운트가 필요하단거지
        // 여기까지 필요한 데이터들을 만들어 놓고
        int count = 0;
        int startIndex = 0;
        for (int i = 0; i < days.length; i++) {
            if (days[i].equals(day)) {
                startIndex = i;
            }
        }

        // 실 계산은 여기서 하는건데
        // 주말과 공휴일은 쉰다고 했잖아.
        for (int i = 1; i <= N; i++) {
            int dayIndex = (startIndex + i - 1) % 7;
            boolean weekend = (dayIndex == 5 || dayIndex == 6);
            boolean isHoliday = holidays.contains(i);

            if (!weekend && !isHoliday) {
                count++;
            }
        }

        System.out.println(count);
    }
}
