//22864 피로도
package Baekjoon.Math;

import java.util.Scanner;

public class Fatigue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); //한시간 피로도
        int B = sc.nextInt(); // 일
        int C = sc.nextInt(); // 휴식
        int M = sc.nextInt(); // 피로도 max

        int fatigue = 0; // 피로도
        int answer = 0; // 작업량
        for(int i=0; i<24; i++) {
            if(fatigue + A <= M) {
                fatigue += A;
                answer += B;
            } else {
                fatigue -= C;
                if(fatigue < 0) {
                    fatigue = 0;
                }
            }
        }

        System.out.println(answer);
    }
}
