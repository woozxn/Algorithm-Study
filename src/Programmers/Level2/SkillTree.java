package Programmers.Level2;

//스킬트리
class SkillTree {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(String skilltree : skill_trees) {
            String temp = skilltree;

            for(int i=0; i<skilltree.length(); i++) {
                String str = skilltree.substring(i, i+1);
                if(!skill.contains(str)) {
                    temp = temp.replace(str, "");
                }
            }
            if(skill.indexOf(temp) == 0) {
                answer++;
            }
        }
        return answer;
    }
}