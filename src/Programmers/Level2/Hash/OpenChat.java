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
//클래스 방식
//import java.util.ArrayList;
//import java.util.HashMap;
//
//class Solution {
//    private static final String ENTER_FORMAT = "%s님이 들어왔습니다.";
//    private static final String LEAVE_FORMAT = "%s님이 나갔습니다.";
//
//    private HashMap<String, UserInfo> userMap = new HashMap<>();
//
//    private class UserInfo {
//        public String userId;
//        public String nickName;
//
//        public UserInfo(String userId, String nickName) {
//            this.userId = userId;
//            this.nickName = nickName;
//        }
//
//    }
//
//    private class Command {
//        public char command;
//        public String userId;
//
//        public Command(char command, String userName) {
//            this.command = command;
//            this.userId = userName;
//        }
//    }
//
//
//    public String[] solution(String[] records) {
//        ArrayList<Command> commandList = new ArrayList<>();
//
//        for (String record : records) {
//            String[] split = record.split(" ");
//            String command = split[0];
//            String userId = split[1];
//            String nickName = null;
//
//            switch(command.charAt(0)) {
//                case 'E': // Enter
//                    nickName = split[2];
//                    if(userMap.containsKey(userId) == false) {
//                        userMap.put(userId, new UserInfo(userId, nickName));
//                    } else {
//                        userMap.get(userId).nickName = nickName;
//                    }
//
//                    commandList.add(new Command(command.charAt(0), userId));
//                    break;
//                case 'L': // Leave
//                    commandList.add(new Command(command.charAt(0), userId));
//                    break;
//                case 'C': // Change
//                    nickName = split[2];
//                    userMap.get(userId).nickName = nickName;
//                    break;
//            }
//        }
//
//        return commandList.stream()
//                .map(cmd -> String.format( cmd.command == 'E' ? ENTER_FORMAT : LEAVE_FORMAT , userMap.get(cmd.userId).nickName))
//                .toArray(ary -> new String[commandList.size()]);
//    }
//}
