//2217 로프
package Baekjoon.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Rope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int box = 0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int k=0; k<n; k++) {
            box = arr[k] * (n-k);
            if(box > max) max = box;
        }

        System.out.println(max);
    }
}
