//1541 잃어버린 괄호
package Baekjoon.Greedy;

import java.util.Scanner;

public class LostBracket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("-");
        int answer = 0;

        for(int i=0; i<arr.length; i++) {
            String[] arr2 = arr[i].split("\\+");

            int sum = 0;

            for(int j=0; j<arr2.length; j++) {
                sum += Integer.parseInt(arr2[j]);
            }

            if(i==0) {
                answer = sum;
            } else {
                answer -= sum;
            }
        }

        System.out.println(answer);
    }
}
