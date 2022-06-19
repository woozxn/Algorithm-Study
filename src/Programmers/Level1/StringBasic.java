package Programmers.Level1;
//문자열 다루기 기본
class StringBasic {
    public boolean solution(String s) {
        if(s.length() == 4 | s.length() == 6) {
            return s.matches("^[0-9]*$");
        }
        return false;
    }
}