package Programmers.Level2.Stack;

import java.util.Stack;

//주식가격
//스택 사용
class StockPrice {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop(); // 답을 구했기 때문에 stack에서 제거한다
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) { // 값을 구하지 못한 index == 끝까지 가격이 떨어지지 않은 주식
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        return answer;
    }

}

//2중 반복문
//class Solution220315 {
//    public int[] solution(int[] prices) {
//        int[] answer = new int[prices.length];
//
//        for(int i=0; i<prices.length; i++) {
//            for(int j=i+1; j<prices.length; j++) {
//                answer[i]++;
//                if(prices[i] > prices[j]) break;
//            }
//        }
//
//        return answer;
//    }
//}