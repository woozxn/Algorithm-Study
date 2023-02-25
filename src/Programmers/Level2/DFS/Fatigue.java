package Programmers.Level2.DFS;

class Fatigue {
    static boolean[] visit;
    static int count = 0;

    public int solution(int k, int[][] dungeons) {
        visit = new boolean[dungeons.length];
        dfs(dungeons, k, 0);
        return count;
    }

    public void dfs(int[][] dungeons, int fatigue, int depth) {
        for(int i=0; i<dungeons.length; i++) {
            if(!visit[i] && dungeons[i][0] <= fatigue){
                visit[i] = true;
                dfs(dungeons, fatigue-dungeons[i][1], depth+1);
                visit[i] = false;
            }
        }
        count = Math.max(depth, count);
    }
}