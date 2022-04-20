package Programmers.Level2;

//피보나치 수
class Fibonacci {
    public int solution(int n) {
        int answer = 0;

        int pnum = 1; //n-1
        int ppnum = 0; //n-2

        for(int i=2; i<=n; i++) {
            if(n==0) {return 0;}
            else if(n==1) {return 1;}
            else {
                answer = (pnum + ppnum)%1234567;
                ppnum = pnum%1234567;
                pnum = answer%1234567;
            }
        }

        return answer;
    }
}