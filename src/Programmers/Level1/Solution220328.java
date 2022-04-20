package Programmers.Level1;

//없는 숫자 더하기
class Solution220328 {
    public int solution(int[] numbers) {
        int answer = 0;
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        answer = 45-sum;

        return answer;
    }
}