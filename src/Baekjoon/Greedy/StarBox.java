//1758 알바생 강호
package Baekjoon.Greedy;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StarBox {
    public static void main(String[] args) throws NumberFormatException {    //NumberFormatException?
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] money = new Integer[n];
        long answer = 0;                                // 답 범위 때문에 long 형으로 해줘야 하는건가?

        for(int i=0; i<n; i++) {
            money[i] = sc.nextInt();
        }
        Arrays.sort(money, Comparator.reverseOrder()); // Integer 배열이어야 내림차순 정렬 가능?? -> Yes

        for(int k=0; k<n; k++) {
            int tip = money[k] - k;
            if(tip < 0) {
                break;
            }
            answer += tip;
        }

        System.out.println(answer);
    }

}
