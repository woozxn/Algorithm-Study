//11047 동전 0
package Baekjoon.Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Coin0 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] arr = new Integer[N];
        int count = 0;

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        for(int j=0; j<N; j++) {
            if(K >= arr[j]) {
                count += K / arr[j];
                K = K % arr[j];
            }
        }

        System.out.println(count);
    }
}
