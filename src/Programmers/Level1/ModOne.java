package Programmers.Level1;
//나머지가 1이 되는 수 찾기
class ModOne {
    public int solution(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                return i;
            }
        }

        return -1;
    }
}
