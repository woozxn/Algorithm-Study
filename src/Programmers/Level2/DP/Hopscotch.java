package Programmers.Level2.DP;

//땅따먹기
class Hopscotch {
    int solution(int[][] land) {
        int answer = 0;

        for(int i=1; i<land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }

        for(int i=0; i<=3; i++) {
            answer = Math.max(answer, land[land.length-1][i]);
        }

        return answer;
    }
}

//다른 사람 풀이
//class Hopscotch {
//    int hopscotch(int[][] board, int size) {
//        return hopscotch(board, size, 0, -1);
//    }
//
//    private int hopscotch(int[][] board, int size, int y, int idx) {
//        if (y >= size) return 0;
//        int answer = Integer.MIN_VALUE;
//        for (int i = 0; i < 4; i++) {
//            if (i != idx) {
//                answer = Math.max(hopscotch(board, size, y + 1, i) + board[y][i], answer);
//            }
//        }
//        return answer;
//    }