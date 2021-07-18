package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level07_02 {
    // 11720번 - 숫자의 합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        String numberStr = br.readLine();
        int result = 0;
        for(int i=0; i<n; i++) result += ( numberStr.charAt(i) - '0');
        System.out.println(result);
    }
}
