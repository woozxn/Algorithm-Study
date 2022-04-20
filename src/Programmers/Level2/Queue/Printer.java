package Programmers.Level2.Queue;//프린터
import java.util.Collections;
import java.util.PriorityQueue;
class Printer {
    public int solution(int[] priorities, int location) {
        int answer = 1; //출력순서

        //우선순위 내림차순 정렬
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int priority : priorities) {
            queue.offer(priority);
        }

        //우선순위 높은 순으로 기존 배열에서 일치하는 것 찾기
        while(!queue.isEmpty()) {
            for(int i=0; i < priorities.length; i++) {
                if(queue.peek() == priorities[i]) {
                    //queue에서 읽은 요소가 location에 위치한 요소일 경우 출력순서 리턴
                    if(i == location) {
                        return answer;
                    }
                    answer++;
                    queue.poll(); //값을 찾으면 큐에서 제거
                }
            }
        }
        return answer;
    }
}

//다른 레전드 풀이
//import java.util.*;
//
//class Solution {
//    public int solution(int[] priorities, int location) {
//        int answer = 0;
//        int l = location;
//
//        Queue<Integer> que = new LinkedList<Integer>();
//        for(int i : priorities){
//            que.add(i);
//        }
//
//        Arrays.sort(priorities);
//        int size = priorities.length-1;
//
//
//
//        while(!que.isEmpty()){
//            Integer i = que.poll();
//            if(i == priorities[size - answer]){
//                answer++;
//                l--;
//                if(l <0)
//                    break;
//            }else{
//                que.add(i);
//                l--;
//                if(l<0)
//                    l=que.size()-1;
//            }
//        }
//
//        return answer;
//    }
//}
