package Programmers.Level1;

//키패드 누르기
//다른 사람 풀이
class Solution220327 {
    public static String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
        int leftIndex = 10;	 // '*' => 10으로 치환
        int rightIndex = 12; // '#' => 12로 치환

        for(int number : numbers) {
            if(number == 1 || number == 4 || number == 7) { // Left
                sb.append("L");
                leftIndex = number;
            } else if(number == 3 || number == 6 || number == 9) {	// Right
                sb.append("R");
                rightIndex = number;
            } else { // Center
                int leftLength = getLength(leftIndex, number);
                int rightLength = getLength(rightIndex, number);

                if(leftLength > rightLength) {
                    sb.append("R");
                    rightIndex = number;
                } else if(leftLength < rightLength) {
                    sb.append("L");
                    leftIndex = number;
                } else {
                    if(hand.equals("right")) {
                        sb.append("R");
                        rightIndex = number;
                    } else {
                        sb.append("L");
                        leftIndex = number;
                    }
                }
            }
        }
        return sb.toString();
    }

    public static int getLength(int index, int number) {

        // 숫자 0의 경우 11로 치환
        index = (index == 0) ? 11 : index;
        number = (number == 0) ? 11 : number;

        int x = (index - 1) / 3;
        int y = (index - 1) % 3;
        int numberX = number / 3;
        int numberY = 1;

        return Math.abs(x-numberX) + Math.abs(y-numberY);
    }
}

//내 풀이
//class Solution {
//    public String solution(int[] numbers, String hand) {
//        String answer = "";
//        int lPos = 10;
//        int rPos = 12;
//        for(int i=0; i<numbers.length; i++) {
//            if(numbers[i] == 0) numbers[i] = 11;
//            if(numbers[i]%3 == 1) {
//                answer += "L";
//                lPos = numbers[i];
//            } else if(numbers[i]%3 == 0) {
//                answer += "R";
//                rPos = numbers[i];
//            } else {
//                int ll = (Math.abs(lPos-numbers[i]))/3 + (Math.abs(lPos-numbers[i]))%3;
//                int rr = (Math.abs(rPos-numbers[i]))/3 + (Math.abs(rPos-numbers[i]))%3;
//
//                if(ll>rr) {
//                    answer += "R";
//                    rPos = numbers[i];
//                } else if(ll<rr) {
//                    answer += "L";
//                    lPos = numbers[i];
//                } else if(ll == rr) {
//                    if(hand.equals("right")) {
//                        answer += "R";
//                        rPos = numbers[i];
//                    } else if(hand.equals("left")) {
//                        answer += "L";
//                        lPos = numbers[i];
//                    }
//                }
//            }
//        }
//        return answer;
//    }
//}