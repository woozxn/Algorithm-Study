package Programmers.Level1;
//3진법 뒤집기
class TriadFlip {
    public int solution(int n) {
        String a = "";

        while(n > 0){
            a = (n % 3) + a;
            n /= 3;
        }
        a = new StringBuilder(a).reverse().toString();


        return Integer.parseInt(a,3);
    }
}
//class Solution {
//    public int solution(int n) {
//        int answer = 0;
//        String third = Integer.toString(n, 3);
//        StringBuffer sb = new StringBuffer(third);
//        String reversed = sb.reverse().toString();
//
//        int exp = 0;
//        for (int i = reversed.length() - 1; i >= 0; i--) {
//            answer += Integer.parseInt(String.valueOf(reversed.charAt(i))) * Math.pow(3, exp);
//            exp++;
//        }
//
//        return answer;
//    }
//}