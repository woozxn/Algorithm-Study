package Programmers.Level2.Hash;
//오픈채팅방

import java.util.*;
class OpenChat {
    public String[] solution(String[] record) {

        List<String> result = new ArrayList<>();
        Map<String, String> id = new HashMap<>(); //uid, nickname

        for(int i=0; i<record.length; i++) {
            String[] temp = record[i].split(" ");

            if(temp[0].equals("Enter")) {
                id.put(temp[1], temp[2]);
                result.add(temp[1] + "님이 들어왔습니다.");
            } else if(temp[0].equals("Change")) {
                id.replace(temp[1], temp[2]);
            } else if(temp[0].equals("Leave")) {
                result.add(temp[1] + "님이 나갔습니다.");
            }
        }

        String[] answer = new String[result.size()];
        for(int i=0; i<result.size(); i++) {
            int idx = result.get(i).indexOf("님");
            String uid = result.get(i).substring(0, idx);
            answer[i] = id.get(uid) + result.get(i).substring(idx);
        }
        return answer;
    }
}