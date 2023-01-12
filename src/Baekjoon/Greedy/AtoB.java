//16953 A -> B
package Baekjoon.Greedy;

import java.util.Scanner;

public class AtoB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int count = 1;

        while (A != B) {
            if (A > B) {
                count = -1;
                break;
            }
            if (B % 10 != 1 && B % 2 != 0) {
                count = -1;
                break;
            }

            if (B % 2 == 0) {
                B = B / 2;
            } else {
                B = (B - 1) / 10;
            }
            count++;
        }
        System.out.println(count);
    }
}