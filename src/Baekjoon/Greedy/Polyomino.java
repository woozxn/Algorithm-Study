//1343 폴리오미노
package Baekjoon.Greedy;

import java.util.Scanner;

public class Polyomino {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        String ans = "";

        ans = replace(input);

        System.out.println(ans);
    }

    private static String replace(String s) {
        String answer = "";
        String A = "AAAA";
        String B = "BB";

        s = s.replaceAll("XXXX", A);
        answer = s.replaceAll("XX", B);

        if(answer.contains("X")) {
            answer = "-1";
        }
        return answer;
    }
}
