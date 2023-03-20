//1789 수들의 합
package Baekjoon.BinarySearch;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(solve(n));
    }
    static int solve(long n) {
        long sum = 0;
        int addNum = 0;
        while(n >= sum) {
            sum += (++addNum);
        }

        return sum == n ? addNum : addNum - 1;
    }
}
