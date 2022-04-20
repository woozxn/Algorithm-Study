package Programmers.Level1;//로또의 최고 순위와 최저 순위

class Solution220116 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] result = new int[2];

        int zeroCount = 0;
        int matchCount = 0;
        int[] rank = {6, 6, 5, 4, 3, 2 ,1};

        for(int i=0; i<lottos.length; i++) {
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i] == 0) {
                    zeroCount++;
                    break;
                }

                if(lottos[i] == win_nums[j]) {
                    matchCount++;
                    break;
                }
            }
        }

        result[0] = rank[matchCount + zeroCount];
        result[1] = rank[matchCount];

        return result;
    }
}


/** 다른 코드
 * class Solution {
 *     public int[] solution(int[] lottos, int[] win_nums) {
 *         int zero = 0;
 *         int matched = 0;
 *
 *         for (int l : lottos) {
 *             if (l == 0) zero++;
 *             else {
 *                 for (int w : win_nums) {
 *                     if (l == w) {
 *                         matched++;
 *                         break;
 *                     }
 *                 }
 *             }
 *         }
 *
 *         int min = matched;
 *         int max = matched + zero;
 *
 *         int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};
 *         return answer;
 *     }
 * }
 */