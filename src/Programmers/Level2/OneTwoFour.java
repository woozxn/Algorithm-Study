package Programmers.Level2;

//124 나라의 숫자
//3진법 변환 응용
class OneTwoFour {
    public String solution(int n) {

        String answer = "";
        String[] tmp = {"4", "1", "2"};

        while(n>0) {
            answer = tmp[n%3] + answer;
            n = (n-1)/3;
        }

        return answer;
    }
}