package Programmers.Level2;//괄호 변환

class ParenthesisConversion {
    static String answer2 = "";

    public String solution(String p) {

        String answer = "";

        answer = change(p);
        return answer;
    }

    public static String change(String w) {
        String u = "";
        String v = "";
        boolean flag = true;

        if(w == "") return w;

        for(int i=2; i<=w.length(); i+=2) {
            u = w.substring(0, i);
            v = w.substring(i);

            flag = true;

            int start = 0;
            int end = 0;

            for(int j=0; j<u.length(); j++) {
                if(u.charAt(j) == '(') start++;
                else end++;

                if(end > start) flag = false;
            }

            if(start == end) break;
        }

        if(flag == true) {
            return  u + change(v);
        } else {
            answer2 = "(" + change(v) + ")";
            u = u.substring(1, u.length()-1);
            u = u.replace("(", "a");
            u = u.replace(")", "b");
            u = u.replace("a", ")");
            u = u.replace("b", "(");
        }
        answer2 += u;

        return answer2;
    }
}