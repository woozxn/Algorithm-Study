package Programmers.Level1;

//핸드폰 번호 가리기
class Solution220301 {
    public String solution(String phone_number) {
        String answer = "";
        char[] num = phone_number.toCharArray();

        for(int i=0; i<num.length-4; i++) {
            num[i] = '*';
        }
        answer = new String(num);
        return answer;
    }
}