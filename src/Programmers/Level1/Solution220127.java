package Programmers.Level1;//같은 숫자는 싫어

import java.util.*;

public class Solution220127 {
    public int[] solution(int []arr) {

        int[] temp = new int[arr.length];
        int n = 0;

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] != arr[i+1]){
                temp[n] = arr[i];
                n++;
            }
        }
        temp[n++] = arr[arr.length-1];

        int[] answer = new int[n];

        for(int j=0; j<n; j++) {
            answer[j] = temp[j];
        }

        return answer;
    }
}

//다른 사람 풀이
/**
 * import java.util.*;
 *
 * public class Solution {
 *     public int[] solution(int []arr) {
 *         ArrayList<Integer> tempList = new ArrayList<Integer>();
 *         int preNum = 10;
 *         for(int num : arr) {
 *             if(preNum != num)
 *                 tempList.add(num);
 *             preNum = num;
 *         }
 *         int[] answer = new int[tempList.size()];
 *         for(int i=0; i<answer.length; i++) {
 *             answer[i] = tempList.get(i).intValue();
 *         }
 *         return answer;
 *     }
 * }
 */