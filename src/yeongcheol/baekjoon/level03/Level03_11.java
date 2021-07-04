package level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Level03_11 {
    // 10871번 - X보다 작은 수
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int secondLineNum;
        st = new StringTokenizer(bf.readLine());
        for(int i=0; i<n; i++) {
            secondLineNum = Integer.parseInt(st.nextToken());
            bw.write((secondLineNum < x ? secondLineNum+" ": ""));
        }
        bw.close();
    }
}
