package Programmers.Level1;//완주하지 못한 선수

import java.util.*;
class Solution220329 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        for(i=0; i<completion.length; i++) {
            if(!participant[i].equals(completion[i])) {
                break;
            }
        }
        answer = participant[i];

        return answer;
    }
}

//해시
//getOrDefault() > 찾는 키가 존재하면 해당 키의 값을 반환하고, 없으면 기본값을 반환한다
//hash.getOrDefault(arg라는 키, arg키가 ㅈㄴ재하면 해당 값 / 없으면 0) 그리고 +1
//완주한 선수 completion을 map에 추가할 때 1을 빼주고, 해당하는 키 값이 0이 아닐 때 완주하지 못한 선수이므로 해당 key를 return

//class Solution {
//    public String solution(String[] participant, String[] completion) {
//        Map<String, Integer> hash = new HashMap<>();
//
//        for(String arg : participant) {
//            hash.put(arg, hash.getOrDefault(arg, 0) + 1);
//        }
//        for(String arg : completion) {
//            hash.put(arg, hash.get(arg) - 1);
//        }
//        for(String key : hash.KeySet()) {
//            if(hash.get(key) != 0) {
//                return key;
//            }
//        }
//
//        return null;
//    }
//}