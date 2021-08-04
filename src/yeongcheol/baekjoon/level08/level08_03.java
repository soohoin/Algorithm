package level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level08_03 {
    // 1193번 분수찾기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.valueOf(br.readLine());
        int location = 1;
        int start = 0;    // 지그재그 그룹의 분수중 앞자리에 해당하는 숫자
        int total = 2;    // 각 지그재그 그룹의 분자+분모 (같은 그룹은 모두 동일하다.)
        while(true) {

            // total 이 짝수 >  total-1 부터 시작해서 1까지 감소시키면서 location을 증가 시킨다.
            if(total % 2 == 0) {
                for(int i=total-1; i>0 ; i--) {
                    start = i;
                    if(location == x)break;
                    location++;
                }

            // total 이 홀수 >  1 부터 시작해서 total-1 까지 증가시키면서 location을 증가 시킨다.
            } else {
                for(int i=1; i<total ; i++) {
                    start = i;
                    if(location == x)break;
                    location++;
                }
            }
            if(location == x) break;
            total++;
        }
        System.out.println(start+"/"+(total-start));
    }
}
