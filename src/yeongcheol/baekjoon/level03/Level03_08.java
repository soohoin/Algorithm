package level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Level03_08 {
    // 11022번 - A+B - 8
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCnt = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        int first,second;
        for(int i=1; i<=testCnt; i++) {
            st = new StringTokenizer(bf.readLine());
            first = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());
            bw.write("Case #"+i+": "+first+" + "+second+" = "+(first+second)+"\n");
        }
        bw.close();
    }
}
