package Baekjoon.ShortestPath;

import java.util.*;

public class MinDist {
    static int N; //도시의 개수
    static int[][] map;
    static boolean[] visit;
    static int[] dis;
    static Queue<Integer> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int X = sc.nextInt();

        map = new int[N + 1][N + 1];
        visit = new boolean[N + 1];
        dis = new int[N + 1];
        dis[X] = 0;


        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            map[a][b] = map[b][a] = 1;
        }
        q.add(x);
        visit[x] = true;
        bfs(X);
    }

    static void bfs(int x) {
        while(!q.isEmpty()) {
            for(int i=1; i<=N; i++) {
                if(map[x][i] == 1 && !visit[i]) {
                    q.add(i);
                    dis[i] = dis[x] + 1;
                }
            }
        }
    }
}

