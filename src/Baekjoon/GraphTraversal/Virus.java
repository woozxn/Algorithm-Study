//2606 바이러스
package Baekjoon.GraphTraversal;

import java.util.Scanner;

public class Virus {

    static int N, M;
    static int[][] virus;
    static boolean[] visit;
    static int count = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 컴퓨터 수
        M = sc.nextInt(); // 연결된 수

        visit = new boolean[N+1];
        virus = new int[N+1][N+1];

        for(int i=0; i<M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            virus[a][b] = virus[b][a] = 1;
        }

        System.out.println(dfs(1));
    }

    static int dfs(int a) {
        visit[a] = true;
        for(int i=1; i<=N; i++) {
            if(virus[a][i] == 1 && visit[i] == false) {
                count++;
                dfs(i);
            }
        }
        return count;
    }

}
