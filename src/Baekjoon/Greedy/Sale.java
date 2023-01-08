//11508 2+1 세일
package Baekjoon.Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Sale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        int answer = 0;

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        for(int k=0; k<n; k++) {
            if(k%3 !=2){
                answer += arr[k];
            }
        }

        System.out.println(answer);
    }
}