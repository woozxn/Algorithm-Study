package Programmers.Level1;

//소수 찾기
class Solution220220 {
    public int solution(int n) {
        int answer = 0;
        boolean c = true;
        for(int i=2; i<=n; i++) {
            for(int j=2; j<=Math.sqrt(i); j++) {
                if(i%j == 0) {
                    c = false;
                    break;
                }
            }
            if(c==true) {
                answer++;
            }
            c = true;
        }
        return answer;
    }
}