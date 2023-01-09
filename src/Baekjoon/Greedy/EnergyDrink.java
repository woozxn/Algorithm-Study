//20115 에너지드링크
package Baekjoon.Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class EnergyDrink {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] arr = new long[N];

        for(int i=0; i<N; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        double sum = arr[N-1]; // 소수점이 들어가서 double 사용

        for(int j=0; j<N-1; j++) {
            sum += (double)arr[j]/2;
        }

        System.out.println(sum);
    }
}
