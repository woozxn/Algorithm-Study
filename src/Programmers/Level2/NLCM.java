package Programmers.Level2;

//n개의 최소공배수
class NLCM {

    // 최대 공약수
    public int GCD(int a, int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(b == 0)      return a;
        else            return GCD(b, a%b);
    }

    // 최소 공배수 - a*b / 최대공약수
    public int LCM(int a, int b){
        return a*b / GCD(a, b);
    }

    public int solution(int[] arr) {
        int answer = arr[0];
        for(int i=1; i<arr.length; i++)
            answer = LCM(answer, arr[i]);
        return answer;
    }
}

//class NLCM {
//    public long nlcm(int[] num) {
//        long answer = num[0],g;
//    for(int i=1;i<num.length;i++){
//      g=gcd(answer,num[i]);
//            answer=g*(answer/g)*(num[i]/g);
//    }
//        return answer;
//    }
//    public long gcd(long a,long b){
//    if(a>b)
//      return (a%b==0)? b:gcd(b,a%b);
//    else
//      return (b%a==0)? a:gcd(a,b%a);
//  }
//    public static void main(String[] args) {
//        NLCM c = new NLCM();
//        int[] ex = { 2, 6, 8, 14 };
//        // 아래는 테스트로 출력해 보기 위한 코드입니다.
//        System.out.println(c.nlcm(ex));
//    }
//}