package Baekjoon.Math;

import java.util.Scanner;

public class PlusCycle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = N;

        int count = 0;
        while(true) {
            if(N<10) {
                N = 10*N + N;
            } else {
                N = ((N%10) * 10) + ((N%10 + N/10)%10);
            }
            count++;
            if(answer == N) break;
        }

        System.out.println(count);
    }
}
