package Programmers.Level2.Hash;//전화번호 목록
import java.util.*;
class PhoneNumList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i=1; i<phone_book.length; i++) {
            if(phone_book[i].startsWith(phone_book[i-1])) {
                return false;
            }
        }

        return true;
    }
}

//해시 풀이
//import java.util.HashMap;
//import java.util.Map;

//class Solution {
//    public boolean solution(String[] phoneBook) {
//        boolean answer = true;
//
//        Map<String, Integer> map = new HashMap<>();
//
//        for(int i = 0; i < phoneBook.length; i++) {
//            map.put(phoneBook[i], i);
//        }
//
//        for(int i = 0; i < phoneBook.length; i++) {
//            for(int j = 0; j < phoneBook[i].length(); j++) {
//                if(map.containsKey(phoneBook[i].substring(0,j))) {
//                    answer = false;
//                    return answer;
//                }
//            }
//        }
//
//        return answer;
//    }
//}