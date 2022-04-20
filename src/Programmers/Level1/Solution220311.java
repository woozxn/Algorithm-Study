package Programmers.Level1;//모의고사

import java.util.ArrayList;

class Solution220311 {
    public int[] solution(int[] answers) {

        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == supo1[i%5]) {
                cnt1++;
            }
            if(answers[i] == supo2[i%8]) {
                cnt2++;
            }
            if(answers[i] == supo3[i%10]) {
                cnt3++;
            }
        }

        int max = Math.max(Math.max(cnt1, cnt2), cnt3);

        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max == cnt1) {list.add(1);}
        if(max == cnt2) {list.add(2);}
        if(max == cnt3) {list.add(3);}

        int[] answer = new int[list.size()];

        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}