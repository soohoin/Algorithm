package level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Level05_03 {
    // 2577번 - 숫자의 개수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String result = String.valueOf((Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine())));
        int [] countArray = new int[10];
        for(int i=0; i<result.length(); i++) countArray[result.charAt(i)-'0']++;
        for(int num : countArray) sb.append(num+"\n");
        System.out.println(sb.toString());
    }
}
