package Programmers.Level2;

//최댓값과 최솟값
class MinMax {
    public String solution(String s) {
        String answer = "";
        int min = 0;
        int max = 0;
        int n = 0;

        String[] tmp = s.split(" ");

        min = max = Integer.parseInt(tmp[0]);

        for(int i=1; i<tmp.length; i++) {
            n = Integer.parseInt(tmp[i]);
            if(n > max) max = n;
            if(n < min) min = n;
        }

        return min + " " + max;
    }
}