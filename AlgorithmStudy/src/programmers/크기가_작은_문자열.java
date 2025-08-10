public class 크기가_작은_문자열 {
    class Solution {
        public long solution(String t, String p) {
            long answer = 0;
            // 0~3, 1~4, 2~5 이런식
            for (int i = 0; i < t.length(); i++) {
                if (p.length() + i <= t.length()) {
                    String result = t.substring(i, p.length() + i);
                    if (Long.parseLong(result) <= Long.parseLong(p)) {
                        answer++;
                    }
                }
            }

            return answer;
        }
    }
}
