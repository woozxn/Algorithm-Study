package Programmers.Level1;//두개 뽑아서 더하기
import java.util.Set;
import java.util.HashSet;

class Solution220303 {
    public int[] solution(int[] numbers) {
        int[] answer = {};

        Set<Integer> hset = new HashSet<>();

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                hset.add(numbers[i] + numbers[j]);
            }
        }
        return hset.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
}

//HashSet
//중복값 허용 x, 순서 보장 x, null값 가능