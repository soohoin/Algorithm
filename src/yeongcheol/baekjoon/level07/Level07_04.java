package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level07_04 {
    // 2675 - 문자열 반복
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.valueOf(br.readLine());
        StringTokenizer st;
        int r;
        String s, c;
        for(int i=0; i<t; i++) {
            st = new StringTokenizer(br.readLine());
            r = Integer.valueOf(st.nextToken());
            s = st.nextToken();
            for(int j=0; j<s.length(); j++) {
                c = s.substring(j, j+1);
                for(int k=0; k<r; k++) {
                    sb.append(c);
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
