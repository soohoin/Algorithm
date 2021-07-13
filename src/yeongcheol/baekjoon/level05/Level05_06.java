package level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Level05_06 {
    // 8958번 - OX퀴즈
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int loopCnt = Integer.valueOf(br.readLine());
        int score, sum;
        String input;
        for(int i=0; i<loopCnt; i++) {
            input = br.readLine();
            score = 0;
            sum = 0;
            for(int j=0; j<input.length(); j++) {
                if(input.charAt(j) == 'O') {
                    score++;
                } else {
                    sum += ((score+1)*score) / 2;
                    score = 0;
                }
            }
            sb.append(((sum += ((score+1)*score) / 2)+"\n"));
        }
        System.out.println(sb.toString());
    }
}
