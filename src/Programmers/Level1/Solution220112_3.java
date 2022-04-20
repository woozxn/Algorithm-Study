package Programmers.Level1;//2016년

class Solution220112_3 {
    public String solution(int a, int b) {
        String answer = "";

        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] month = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        for(int i=0; i<a-1; i++) {
            sum += month[i];
        }

        sum += (b-1);
        answer = day[sum%7];

        return answer;
    }
}