package level04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Level04_03 {
    // 1110번 더하기 사이클
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cycleNumber = Integer.parseInt(br.readLine());
        int result = cycleNumber, loopCnt = 0;
        while(true) {
            loopCnt++;
            result = ((result%10)*10) + ( ((result/10) + (result%10))%10 );
            if(cycleNumber == result)  break;
        }
        System.out.println(loopCnt);
    }
}
