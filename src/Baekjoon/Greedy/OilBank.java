//13305 주유소
package Baekjoon.Greedy;

import java.util.Scanner;

public class OilBank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] dis = new long[N - 1];
        long[] price = new long[N];

        for(int i=0; i<N-1; i++) {
            dis[i] = sc.nextLong();
        }

        for(int j=0; j<N; j++) {
            price[j] = sc.nextLong();
        }

        long answer = 0;
        long minPrice = price[0];

        for(int k=0; k<N-1; k++) {
            if(price[k] < minPrice) {
                minPrice = price[k];
            }
            answer += (minPrice * dis[k]);
        }

        System.out.println(answer);
    }
}
