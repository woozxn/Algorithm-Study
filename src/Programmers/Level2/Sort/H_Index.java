package Programmers.Level2.Sort;//H-Index
import java.util.Arrays;
class H_Index {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);

        for(int i=0; i<citations.length; i++) {
            int cnt = citations.length - i;
            if(citations[i] >= cnt) {
                answer = cnt;
                break;
            }
        }
        return answer;
    }
}

//다른 풀이
//import java.util.*;
//
//class Solution {
//    public int solution(int[] citations) {
//        Arrays.sort(citations);
//
//        int max = 0;
//        for(int i = citations.length-1; i > -1; i--){
//            int min = (int)Math.min(citations[i], citations.length - i);
//            if(max < min) max = min;
//        }
//
//        return max;
//    }
//}
