package Programmers.Level2;

//이진 변환 반복하기
class RepeatBinaryTransformation {
    public int[] solution(String s) {

        int[] answer = new int[2];

        while(!s.equals("1")) {
            answer[0]++;
            String temp =  s.replace("0", "");
            answer[1] += s.length() - temp.length();

            s = Integer.toBinaryString(temp.length());
        }

        return answer;
    }
}
//다른 풀이

//class Solution {
//    public int[] solution(String s) {
//        int[] answer = new int[2];
//        int temp;
//        while( !s.equals("1") ) {
//            answer[1] += s.length();
//            s = s.replaceAll("0", "");
//            temp = s.length();
//            s = Integer.toBinaryString(temp);
//            //System.out.println("s : " + s );
//            answer[0]++;
//            answer[1] -= temp;
//        }
//        return answer;
//    }
//}
