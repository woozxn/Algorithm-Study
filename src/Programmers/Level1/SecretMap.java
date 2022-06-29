package Programmers.Level1;
//비밀지도
class SecretMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i=0;i<n;i++) {
            // 이진수로 변환
            String b1 = toBinary(arr1[i], n, new StringBuilder());
            String b2 = toBinary(arr2[i], n, new StringBuilder());
            StringBuilder tmp = new StringBuilder();
            for(int j=0;j<n;j++) {
                // 이진수로 변환된 결과 같은 인덱스 중 어느 하나라도 '1' 이라면 벽으로 처리 (#)
                if (b1.charAt(j) == '1' || b2.charAt(j) == '1') {
                    tmp.append("#");
                    // 모두 0이라면 공백으로 처리
                } else {
                    tmp.append(" ");
                }
            }
            // i 번째 로우 완성
            answer[i] = tmp.toString();

        }
        return answer;
    }
    // 이진수로 변환 메서드
    public String toBinary(int n, int size, StringBuilder sb) {
        // 재귀 종료조건
        if (n<=1) {
            sb.append(String.valueOf(n)); // 0또는 1일테니 이진수의 결과로 붙여줌
            while (sb.length() < size) { // 0 즉 공백 또한 필요하므로 0부분까지 채워줌
                sb.append("0");
            }
            return sb.reverse().toString(); // 역순으로 뒤집어줘야 제대로 된 이진수 String이 나온디.
        } else {
            // 이진수로 변환
            sb.append(String.valueOf(n%2));
            n/=2;
            return toBinary(n, size, sb);
        }
    }
}