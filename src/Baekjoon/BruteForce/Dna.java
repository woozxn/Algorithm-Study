//1969 DNA
package Baekjoon.BruteForce;

import java.util.Scanner;

public class Dna {
    static int HD;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        String[] arr = new String[N];

        StringBuffer sbf = new StringBuffer();

        for(int i=0; i<N; i++) {
            arr[i] = sc.next();
        }


        for(int j=0; j<M; j++) {
            int max = 0;
            int alp = 0;
            int[] cnt = new int[4];
            for(int k=0; k<N; k++) {
                char token = arr[k].charAt(j);
                switch (token) {
                    case 'A' :
                        cnt[0]++;
                        break;

                    case 'C' :
                        cnt[1]++;
                        break;

                    case 'G' :
                        cnt[2]++;
                        break;

                    case 'T' :
                        cnt[3]++;
                        break;
                }
                max = cnt[0];
            }
            for(int i=1; i<4; i++) {
                if(max < cnt[i]) {
                    max = cnt[i];
                    alp = i;
                }
            }

            HD += N-max;

            switch (alp) {
                case 0 :
                    sbf.append('A');
                    break;

                case 1 :
                    sbf.append('C');
                    break;

                case 2 :
                    sbf.append('G');
                    break;

                case 3 :
                    sbf.append('T');
                    break;
            }
        }

        System.out.println(sbf);
        System.out.println(HD);
    }
}
