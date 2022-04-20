package Programmers.Level1;//나누어 떨어지는 숫자 배열
import java.util.Arrays;

class Solution220307 {
    public int[] solution(int[] arr, int divisor) {

        int cnt = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0) {
                cnt++;
            }
        }

        if(cnt == 0) {
            int[] answer2 = {-1};
            return answer2;
        }

        int[] answer = new int[cnt];

        for(int i=0, j=0; i<arr.length; i++) {
            if(arr[i]%divisor == 0) {
                answer[j] = arr[i];
                j++;
            }
        }

        Arrays.sort(answer);

        return answer;
    }
}