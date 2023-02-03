//20546 기적의 매매법
package Baekjoon.Implementation;

import java.util.Scanner;

public class Stock {
    static int monJ, monS;
    static int stockJ, stockS;
    static int[] price = new int[14];

    public static void main(String[] args) {
        // 현금 (준현, 성민)
        // 주식 갯수 (준현, 성민)
        // 주식 가격 배열
        Scanner sc = new Scanner(System.in);
        monJ = monS = sc.nextInt();
        for(int i=0; i<14; i++) {
            price[i] = sc.nextInt();
        }
        if(JH() == SM()) {
            System.out.println("SAMESAME");
        } else if(JH() > SM()) {
            System.out.println("BNP");
        } else {
            System.out.println("TIMING");
        }
    }

    static int JH() {
        for(int i=0; i<14; i++) {
            if(monJ >= price[i]) {
                stockJ = monJ/price[i];
                monJ = monJ%price[i];
            }
        }
        return monJ + (stockJ*price[13]);
    }

    static int SM() {
        int upCount = 0;
        int downCount = 0;
        for(int j=1; j<14; j++) {
            if(price[j-1] > price[j]) {
                downCount++;
                upCount = 0;
                if(downCount == 3 && monS > price[j]) {
                    stockS = monS/price[j];
                    monS = monS%price[j];
                    downCount = 0;
                }

            } else if(price[j-1] < price[j]) {
                upCount++;
                downCount = 0;
                if(upCount == 3) {
                    monS += stockS*price[j];
                    stockS = 0;
                    upCount = 0;
                }
            } else {
                upCount = 0;
                downCount = 0;
            }
        }
        return monS + (stockS*price[13]);
    }
}
