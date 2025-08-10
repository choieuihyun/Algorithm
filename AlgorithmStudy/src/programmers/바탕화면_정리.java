public class 바탕화면_정리 {
    class Solution {
        public int[] solution(String[] wallpaper) {
            int minRow = Integer.MAX_VALUE;
            int minColumn = Integer.MAX_VALUE;
            int maxRow = 0;
            int maxColumn = 0;

            for (int i = 0; i < wallpaper.length; i++) {
                for (int j = 0; j < wallpaper[i].length(); j++) {
                    char c = wallpaper[i].charAt(j);
                    if (c == '#') {
                        minRow = Math.min(minRow, i);
                        minColumn = Math.min(minColumn, j);
                        maxRow = Math.max(maxRow, i);
                        maxColumn = Math.max(maxColumn, j);
                    }
                }
            }

            int[] answer = {minRow, minColumn, maxRow + 1, maxColumn+ 1};

            return answer;
        }
    }
}
