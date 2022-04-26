package Programmers.Level2;
//튜플
import java.util.*;
class Tuple {
    public int[] solution(String s) {
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , ");
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});
        int[] answer = new int[arr.length];
        int idx = 0;
        for(String s1 : arr) {
            for(String s2 : s1.split(",")) {
                if(set.add(s2)) answer[idx++] = Integer.parseInt(s2);
            }
        }
        return answer;
    }
}


//import java.util.*;
//class Tuple{
//    public int[] solution(String s) {
//        int[] answer = {};
//        String [] strs = s.replaceAll("[{}]", " ").trim().split(" ,");
//        answer = new int[strs.length];
//        HashSet<Integer> hs = new HashSet<Integer>();
//        Arrays.sort(strs, (a,b)->(a.length()-b.length()));
//        int i = 0;
//        for(String str : strs){
//            for(String st : str.split(",")){
//                int a  = Integer.parseInt(st.trim());
//                if(hs.contains(a))continue;
//                hs.add(a);
//                answer[i++] = a;
//            }
//        }
//        return answer;
//    }
//}
