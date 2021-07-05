package level04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Level04_01 {
    // 10952번 - A+B - 5
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int firstNum, secondNum;
        while(true) {
            st = new StringTokenizer(bf.readLine());
            firstNum = Integer.parseInt(st.nextToken());
            secondNum = Integer.parseInt(st.nextToken());
            if(firstNum == 0 && secondNum == 0) break;
            bw.write(firstNum + secondNum+"\n");
        }
        bw.close();
    }
}
