package Programmers.Level1;

//하샤드 수
class Solution220304 {
    public boolean solution(int x) {
        boolean answer = false;
        int a, b;
        b = x%10;
        a = (x-b)/10;

        if(x%(a+b) == 0) {
            answer = true;
        }

        return answer;
    }
}