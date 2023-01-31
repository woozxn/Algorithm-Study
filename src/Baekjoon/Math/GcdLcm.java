//2609 최대공약수, 최소공배수
package Baekjoon.Math;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer1 = gcd(a, b);
        int answer2 = lcm(a, b, answer1);

        System.out.println(answer1);
        System.out.println(answer2);
    }

    public static int gcd(int a, int b) {

        if(b == 0) {
            return a;
        }
        int r = Math.max(a,b) % Math.min(a,b);

        return gcd(Math.min(a,b), r);

    }

    public static int lcm(int a, int b, int c) {

        return a * b / c;
    }
}
