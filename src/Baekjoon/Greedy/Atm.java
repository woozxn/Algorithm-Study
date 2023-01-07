//11399 ATM
package Baekjoon.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int answer = 0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int k=0; k<n; k++) {
            answer += arr[k] * (n-k);
        }

        System.out.println(answer);
    }
}
