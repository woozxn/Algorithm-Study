package Programmers.Level2.DFS;

class Network {
    public int solution(int n, int[][] computers) {
        int answer = 0;

        boolean[] visit = new boolean[n];

        for(int i=0; i<n; i++) {
            if(visit[i] == false) {
                dfs(i, computers, visit);
                answer++;
            }
        }

        return answer;
    }

    public void dfs(int i, int[][] computers, boolean[] visit) {
        visit[i] = true;

        for(int j=0; j<computers.length; j++) {
            if(visit[j] == false && computers[i][j] == 1) {
                dfs(j, computers, visit);
            }
        }
    }
}
