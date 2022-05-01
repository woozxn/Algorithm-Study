package Programmers.Level2;
//문자열 압축
public class StringCompression {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i < s.length() / 2 + 1; i++) {
            String prev = s.substring(0, i);
            int count = 1;
            String enc = "";
            String last = "";
            for (int j = i; j < s.length(); j += i) {
                if (j + i > s.length()) {
                    last = s.substring(j);
                    continue;
                }
                if (prev.equals(s.substring(j, j + i))) {
                    count++;
                } else {
                    enc += prev;
                    if (count != 1) {
                        enc = count + enc;
                    }
                    prev = s.substring(j, j + i);
                    count = 1;
                }
            }
            enc += prev + last;
            if (count != 1) {
                enc = count + enc;
            }

            answer = Math.min(answer, enc.length());
        }

        return answer;
    }
}

//다른 풀이
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//
//        for(int i=1; i<=(s.length()/2)+1; i++){
//            int result = getSplitedLength(s, i, 1).length();
//            answer = i==1 ? result : (answer>result?result:answer);
//        }
//
//        return answer;
//    }
//
//    public String getSplitedLength(String s, int n, int repeat){
//        if(s.length() < n) return s;
//        String result = "";
//        String preString = s.substring(0, n);
//        String postString = s.substring(n, s.length());
//
//        // 불일치 -> 현재까지 [반복횟수 + 반복문자] 조합
//        if(!postString.startsWith(preString)){
//            if(repeat ==1) return result += preString + getSplitedLength(postString, n, 1);
//            return result += Integer.toString(repeat) + preString + getSplitedLength(postString, n, 1);
//        }
//
//        return result += getSplitedLength(postString, n, repeat+1);
//    }
//}

