package Programmers.Level1;

//소수 만들기
class Solution220221 {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length-2; i++) {
            for(int j=i+1; j<nums.length-1; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if(check(num) == true) {
                        answer++;
                    }
                }
            }

        }
        return answer;
    }

    public boolean check(int num) {
        boolean sosu = true;

        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) {
                sosu = false;
            }
        }

        return sosu;
    }
}