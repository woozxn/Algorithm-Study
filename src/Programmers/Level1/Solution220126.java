package Programmers.Level1;//두 정수 사이의 값

class Solution220126 {
    public long solution(int a, int b) {
        long answer = 0;

        if(a<b) {
            for(int i=a; i<=b; i++) {
                answer += i;
            }
        }
        else {
            for(int j=b; j<=a; j++) {
                answer += j;
            }
        }
        return answer;
    }
}