package Programmers.Level2.Greedy;//구명보트
import java.util.Arrays;
class LifeBoat {
    public int solution(int[] people, int limit) {
        int answer = 0;

        Arrays.sort(people);

        int min = 0;

        for(int max = people.length-1; min<=max; max--) {
            if(people[min] + people[max] <= limit) min++;
            answer++;
        }

        return answer;
    }
}