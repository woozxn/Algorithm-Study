package Programmers.Level2;

//숫자의 표현
class Expression {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=i; j<=n; j++) {
                sum += j;
                if(n==sum) {
                    answer++;
                    break;
                } else if(sum>n) break;
            }
        }

        return answer;
    }
}