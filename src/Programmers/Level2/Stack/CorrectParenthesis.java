package Programmers.Level2.Stack;

//올바른 괄호
//내 풀이
class CorrectParenthesis {
    boolean solution(String s) {
        boolean answer = false;

        int cnt = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') cnt++;
            if(s.charAt(i) == ')') cnt--;
            if(cnt < 0) break;
        }
        if(cnt == 0) answer = true;

        return answer;
    }
}

// 스택 사용 (굳이?)
//class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//
//        Stack<Character> stack = new Stack<Character>();
//
//
//        for (int i = 0; i < s.length(); i++) {
//            char temp = s.charAt(i);
//
//            if(temp == ')' && stack.size() == 0) {
//                return false;
//            } else if(temp == ')' && stack.size() > 0) {
//                stack.pop();
//            } else if(temp == '(') {
//                stack.push(temp);
//            }
//        }
//
//        if(stack.size() > 0) answer = false;
//
//        return answer;
//    }
//}