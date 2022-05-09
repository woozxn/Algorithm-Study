package Programmers.Level1;
//폰켓몬
import java.util.Arrays;
import java.util.stream.Collectors;

class PhonecketMon {
    public int solution(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phonekemons -> Integer.min(phonekemons.size(), nums.length / 2)));
    }
}