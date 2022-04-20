package Programmers.Level2;
//다음 큰 숫자
class NextBigNumber {
    public int solution(int n) {
        int answer = 0;
        int i;
        int cnt = Integer.bitCount(n); //2진법 1의 개수를 구해줌 Integer.bitCount()

        for(i=n+1; ; i++) {
            if(Integer.bitCount(i) == cnt) {
                return i;
            }
        }
    }
}