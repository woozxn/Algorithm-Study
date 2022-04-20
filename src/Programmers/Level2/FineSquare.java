package Programmers.Level2;

//멀쩡한 사각형
class FineSquare {
    public long solution(int w, int h) {
        long x = w;
        long y = h;
        long answer = x * y;

        long gcd = gcd(x, y);

        x /= gcd;
        y /= gcd;

        answer = answer - gcd * (x + y - 1);

        return answer;

    }

    public long gcd(long x, long y) {
        long max = Math.max(x, y);
        long min = Math.min(x, y);

        if(max%min == 0) return min;

        long temp = max;
        max = min;
        min = temp%min;

        return gcd(max, min);
    }
}