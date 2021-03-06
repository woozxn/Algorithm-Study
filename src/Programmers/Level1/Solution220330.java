package Programmers.Level1;//정렬
//K번째수
import java.util.Arrays;
class Solution220330 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }

        return answer;
    }
}