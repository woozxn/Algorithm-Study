package Programmers.Level1;
//부족한 금액 구하기
class InsufficientMoney {
    public long solution(long price, long money, long count) {
        return Math.max(price * (count * (count + 1) / 2) - money, 0);
    }
}