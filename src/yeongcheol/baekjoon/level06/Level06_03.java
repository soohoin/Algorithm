package level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level06_03 {  
    // 1065번 - 한수
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        n = n == 1000 ? 999 : n;         // 1000은 한수가 아니기 때문에 999로 넣어준다. ( isHanNumber는 세자리만 체크하기 떄문에... )
        int result = n > 99 ? 99 : n;    // result 는 최종 결과인데 n이 99보다 큰 경우 99까지는 한수이기 때문에 99를 넣어준다. 99이하 라면 n을 그대로 대입한다.
        for (int i = 100; i <= n; ++i) { 
            if(isHanNumber(i)) result++;
        }
        System.out.println(result);
    }

    public static boolean isHanNumber(int checkNum) {
        int a_1 = checkNum / 100;
        int a_2 = checkNum / 10 % 10;
        int a_3 = checkNum % 10;
        // a(n번째)​ = a + (n−1) * d
        return a_3 == a_1 + (3-1) * (a_3 - a_2) ;
    }
}
