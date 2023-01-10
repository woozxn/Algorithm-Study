//20365 블로그2
package Baekjoon.Greedy;

import java.util.Scanner;

public class Blog2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String str = sc.next();

        char[] arr = str.toCharArray();
        int countR = 1;
        int countB = 1;
        boolean flag = false; //찾는값일때 true

        for(int i=0; i<N; i++) {
            if(flag == false) {
                if(arr[i] == 'R') {
                    countR++;
                    flag = true;
                }
            } else {
                if(arr[i] == 'B') {
                    flag = false;
                }
            }

        }
        boolean flag2 = false;
        for(int j=0; j<N; j++) {
            if(flag2 == false) {
                if(arr[j] == 'B') {
                    countB++;
                    flag2 = true;
                }
            } else {
                if(arr[j] == 'R') {
                    flag2 = false;
                }
            }
        }

        System.out.println(Math.min(countB, countR));
    }
}
