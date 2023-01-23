//5618 공약수
package Baekjoon.Math;

import java.util.Arrays;
import java.util.Scanner;

public class Divisor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int j=1; j<=arr[0]; j++) {
            int count = 0;
            for(int k=0; k<N; k++) {
                if(arr[k] % j == 0) {
                    count++;
                }
                if(count == N) {
                    System.out.println(j);
                }
            }

        }
    }
}
