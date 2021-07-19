package level06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level06_04 {  
    // 10809 - 알파벳 찾기
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        // 97 ~ 122 ( a ~ z )
        for(int i=97; i<123; i++) sb.append(str.indexOf(i)).append(" "); 
        System.out.println(sb);
    }
}
