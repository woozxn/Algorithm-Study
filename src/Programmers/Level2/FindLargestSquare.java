package Programmers.Level2;
//가장 큰 정사각형 찾기
class FindLargestSquare{
    public int findLargestSquare(int[][] board) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] > 0) {
                    // 위 , 좌 , 좌측 대각선 값을 찾아 그중 최소값 + 1 로 업데이트
                    int up = (j - 1 >= 0) ? board[i][j - 1] : 0;
                    int left = (i - 1 >= 0) ? board[i - 1][j] : 0;
                    int diagonal = (i - 1 >= 0 && j - 1 >= 0) ? board[i - 1][j - 1] : 0;

                    board[i][j] = Math.min(Math.min(up, left), diagonal) + 1;

                    answer = Math.max(answer, board[i][j]); // 최대값을 업데이트
                }
            }
        }

        return answer * answer;
    }
}


