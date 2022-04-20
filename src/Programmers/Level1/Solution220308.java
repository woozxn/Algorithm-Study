package Programmers.Level1;

//문자열 내 p와 y의 개수
class Solution220308 {
    boolean solution(String s) {
        boolean answer = true;

        char[] c = s.toCharArray();
        int a = 0;
        int b = 0;

        for(int i=0; i<c.length; i++) {
            if(c[i] == 'p' || c[i] == 'P') {
                a++;
            } else if(c[i] == 'y' || c[i] == 'Y') {
                b++;
            }
        }

        if(a != b){
            answer = false;
        }

        return answer;
    }
}