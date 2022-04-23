package Programmers.Level2;
//JadenCase 문자열 만들기
public class JadenCase {
    public String solution(String s) {
        String answer = "";

        // 모든 문자열 소문자로 변경
        String[] srr = s.toLowerCase().split("");

        boolean isFirst = true;

        for(int i = 0; i < srr.length; i++) {
            // 첫 글자일 경우 대문자로 변경
            answer += isFirst ? srr[i].toUpperCase() : srr[i];
            // 공백이 나오면 첫 글자 플그래 true로 변경
            isFirst = srr[i].equals(" ") ? true : false;
        }

        return answer;
    }
}

//다른 풀이
//class Solution {
//    public String solution(String s) {
//        String answer = "";
//        String[] sp = s.toLowerCase().split("");
//        boolean flag = true;
//
//        for(String ss : sp) {
//            answer += flag ? ss.toUpperCase() : ss;
//            flag = ss.equals(" ") ? true : false;
//        }
//
//        return answer;
//    }
//}