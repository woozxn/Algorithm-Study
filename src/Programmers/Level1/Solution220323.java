package Programmers.Level1;

//숫자 문자열과 영단어
class Solution220323 {
    public int solution(String s) {
        int answer = 0;

        String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] eng = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for(int i=0; i<eng.length; i++) {
            s = s.replace(eng[i], num[i]);
        }

        answer = Integer.parseInt(s);

        return answer;
    }
}