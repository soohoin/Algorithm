package level04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Level04_02 {
    // 10951번 A+B - 4
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        String input;
        while( (input = bf.readLine()) != null) {
            st = new StringTokenizer(input);
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) +"\n");
        }
        bw.close();
    }
}
