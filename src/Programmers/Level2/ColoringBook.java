package Programmers.Level2;
//카카오프렌즈 컬러링북

import java.util.ArrayList;
import java.util.Collections;

class ColoringBook {
    int span = 0;

    public int[] solution(int m, int n, int[][] picture) {

        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        boolean[][] pathBool = new boolean[m][n];
        ArrayList<Integer> answerList = new ArrayList<>();
        int[] answer = new int[2];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                if (picture[i][j] > 0) {
                    findPath(i, j, picture, pathBool);
                    if(span > 0){
                        answerList.add(span);
                        span = 0;
                    }
                }
            }
        }
        numberOfArea = answerList.size();
        if(numberOfArea == 0){
            return new int[]{0, 0};
        }
        Collections.sort(answerList, Collections.reverseOrder());
        maxSizeOfOneArea = answerList.get(0);
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }

    public void findPath(int m, int n, int[][] picture, boolean[][] pathBool) {
        if (pathBool[m][n] == true)
            return; // 이미 거친 경로일 경우
        long su = picture[m][n]; // 이미지 값
        int column = picture[0].length;
        int row = picture.length;
        pathBool[m][n] = true;
        span++;
        // 오른쪽 이동
        if ((n + 1 < column) && (pathBool[m][n + 1] == false && su == picture[m][n + 1])) {
            findPath(m, n + 1, picture, pathBool);
        }
        // 아래쪽 이동
        if ((m + 1 < row) && (pathBool[m + 1][n] == false && su == picture[m + 1][n])) {
            findPath(m + 1, n, picture, pathBool);
        }
        // 왼쪽 이동
        if ((n - 1 >= 0) && (pathBool[m][n - 1] == false && su == picture[m][n - 1])) {
            findPath(m, n - 1, picture, pathBool);
        }
        // 위쪽 이동
        if ((m - 1 >= 0) && (pathBool[m - 1][n] == false && su == picture[m - 1][n])) {
            findPath(m - 1, n, picture, pathBool);
        }
    }

    public static void main(String[] args) {
        ColoringBook coloringBook = new ColoringBook();
        int m = 4;
        int n = 4;
        int[][] picture = {
                {1,1,1,1},
                {1,4,1,1},
                {1,3,2,1},
                {1,1,1,1}};
        System.out.println(coloringBook.solution(m, n, picture)[0] + ", " + coloringBook.solution(m, n, picture)[1]);
    }
}
// bfs 풀이
//import java.util.LinkedList;
//        import java.util.Queue;
//class Solution {
//    public int[] solution(int m, int n, int[][] picture) {
//
//        boolean[][] check = new boolean[m][n];
//        Queue<Node> q = new LinkedList<>();
//        int[] dx = { 0, 0, -1, 1 };
//        int[] dy = { 1, -1, 0, 0 };
//
//        int numberOfArea = 0;
//        int maxSizeOfOneArea = 0;
//
//        for (int i = 0; i < picture.length; i++) {
//            for (int j = 0; j < picture[i].length; j++) {
//                int tempMax = 0;
//                if (!check[i][j] && picture[i][j] != 0) {
//                    check[i][j] = true;
//                    q.add(new Node(i, j));
//                    tempMax++;
//
//                    while (!q.isEmpty()) {
//
//                        Node current = q.poll();
//
//                        int nextX = 0;
//                        int nextY = 0;
//
//                        for (int k = 0; k < 4; k++) {
//                            nextX = current.x + dx[k];
//                            nextY = current.y + dy[k];
//
//                            if (nextX < 0 || nextY < 0 || nextX >= m || nextY >= n || check[nextX][nextY])
//                                continue;
//                            if (picture[current.x][current.y] == picture[nextX][nextY]) {
//                                check[nextX][nextY] = true;
//                                q.add(new Node(nextX, nextY));
//                                tempMax++;
//                            }
//                        } // end of for_k
//
//                    } // end of while
//                    numberOfArea++;
//                    maxSizeOfOneArea = maxSizeOfOneArea < tempMax ? tempMax : maxSizeOfOneArea;
//                } // end of if
//
//            } // end of for_j
//        } // end of for_i
//
//        int[] answer = new int[2];
//        answer[0] = numberOfArea;
//        answer[1] = maxSizeOfOneArea;
//
//        System.out.println(numberOfArea + "," + maxSizeOfOneArea);
//
//        return answer;
//
//    } // end of solution
//
//    static class Node {
//        int x, y;
//
//        public Node(int x, int y) {
//            this.x = x;
//            this.y = y;
//        }
//    }
//
//}
