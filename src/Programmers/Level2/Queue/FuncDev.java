package Programmers.Level2.Queue;
//기능 개발
//배열 풀이
class FuncDev {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] tmp = new int[100];

        int day = 1;
        int cnt = 0;

        for(int i=0; i<progresses.length; i++) {
            while(progresses[i]+(speeds[i]*day) < 100) {
                day++;
            }
            tmp[day]++;
        }

        for(int n : tmp) {
            if(n != 0) cnt++;
        }

        int[] answer = new int[cnt];

        cnt=0;
        for(int n : tmp) {
            if(n != 0) {
                answer[cnt] = n;
                cnt++;
            }
        }
        return answer;
    }
}

//큐 사용
//import java.util.*;
//
//class Solution {
//    public int[] solution(int[] progresses, int[] speeds) {
//        Queue<Integer> q = new LinkedList<>();
//        List<Integer> answerList = new ArrayList<>();
//
//        for (int i = 0; i < speeds.length; i++) {
//            double remain = (100 - progresses[i]) / (double) speeds[i];
//            int date = (int) Math.ceil(remain);
//
//            if (!q.isEmpty() && q.peek() < date) {
//                answerList.add(q.size());
//                q.clear();
//            }
//
//            q.offer(date);
//        }
//
//        answerList.add(q.size());
//
//        int[] answer = new int[answerList.size()];
//
//        for (int i = 0; i < answer.length; i++) {
//            answer[i] = answerList.get(i);
//        }
//
//        return answer;
//    }
//}

//숏 코드
//import java.util.ArrayList;
//import java.util.Arrays;
//class Solution {
//    public int[] solution(int[] progresses, int[] speeds) {
//        int[] dayOfend = new int[100];
//        int day = -1;
//        for(int i=0; i<progresses.length; i++) {
//            while(progresses[i] + (day*speeds[i]) < 100) {
//                day++;
//            }
//            dayOfend[day]++;
//        }
//        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
//    }
//}