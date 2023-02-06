//#2578 빙고
package Baekjoon.Implementation;

import java.util.Scanner;

public class Bingo {

    static int count = 0;
    static int[][] map = new int[5][5];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i<=25; i++) {
            int n = sc.nextInt();
            for(int j=0; j<5; j++) {
                for(int k=0; k<5; k++) {
                    if(map[j][k] == n) {
                        map[j][k] = 0;
                    }
                }
            }
            checkLR();
            checkUD();
            checkDiagonal();
            checkDiagonal2();

            if(count >= 3) {
                System.out.println(i);
                break;
            }
            count = 0;
            //빙고 체크 로직
        }
    }

    static void checkLR() {
        for(int i=0; i<5; i++) {
            int zeroCount = 0;
            for(int j=0; j<5; j++) {
                if(map[i][j] == 0) {
                    zeroCount++;
                }
            }
            if(zeroCount == 5) {
                count++;
            }
        }
    }

    static void checkUD() {
        for(int i=0; i<5; i++) {
            int zeroCount = 0;
            for(int j=0; j<5; j++) {
                if(map[j][i] == 0) {
                    zeroCount++;
                }
            }
            if(zeroCount == 5) {
                count++;
            }
        }

    }

    static void checkDiagonal() {
        int zeroCount = 0;
        for(int i=0; i<5; i++) {
            if(map[i][i] == 0) {
                zeroCount++;
            }
        }
        if(zeroCount == 5) {
            count++;
        }
    }

    static void checkDiagonal2() {
        int zeroCount = 0;
        for(int i=0; i<5; i++) {
            if(map[i][4-i] == 0) {
                zeroCount++;
            }
        }
        if(zeroCount == 5) {
            count++;
        }
    }
}
