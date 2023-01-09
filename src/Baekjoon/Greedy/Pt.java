//20300 서강근육맨
package Baekjoon.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Pt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        long[] arr = new long[M];

        for(int i=0; i<M; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        long answer = 0;
        long sum = 0;

        if(M%2 == 0) {
            for(int j=0; j<M/2; j++) {
                sum = arr[j] + arr[M-j-1];
                if(sum > answer) {
                    answer = sum;
                }
            }
        } else {
            answer = arr[M-1];
            for(int k=0; k<(M-1)/2; k++) {
                sum = arr[k] + arr[M-k-2];
                if(sum > answer) {
                    answer = sum;
                }
            }
        }
        System.out.println(answer);
    }
}
