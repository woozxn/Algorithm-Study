package Programmers.Level2.완전탐색;
//카펫
import java.util.*;
class Carpet {
    public int[] solution(int brown, int red) {
        int a = (brown+4)/2;
        int b = red+2*a-4;
        int[] answer = {(int)(a+Math.sqrt(a*a-4*b))/2,(int)(a-Math.sqrt(a*a-4*b))/2};
        return answer;
    }
}
//class Carpet {
//    public int[] solution(int brown, int red) {
//        int[] answer = {};
//        answer = new int[2];
//        int iAllNum = brown + red;
//        int iHeight = 0;
//
//        for (int iBrownWidth = 1; iBrownWidth < brown; iBrownWidth++) {
//            iHeight = iAllNum/iBrownWidth;
//
//            if((iBrownWidth-2)*(iHeight-2) == red) {
//                answer[0] = iBrownWidth;
//                answer[1] = iHeight;
//            }
//        }
//        return answer;
//    }
//}