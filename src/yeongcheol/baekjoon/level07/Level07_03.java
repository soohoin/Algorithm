package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level07_03 {
    // 10809번 - 알파벳 팢기
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        // 97 ~ 122 ( a ~ z )
        for(int i=97; i<123; i++) sb.append(str.indexOf(i)).append(" "); 
        System.out.println(sb);
    }
}
