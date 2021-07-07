package level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Level05_01 {
    // 10818번 - 최소, 최대
    public static void main(String[] args) throws IOException {
        int maxNum = -1000000, minNum = 1000000, compareNum;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int inNumbers = Integer.parseInt(bf.readLine());
        StringTokenizer st = new StringTokenizer(bf.readLine());
        for(int i=0; i<inNumbers; i++){
            compareNum = Integer.parseInt(st.nextToken());
            maxNum = Math.max(maxNum, compareNum);
            minNum = Math.min(minNum, compareNum);
        }
        System.out.println(minNum +" "+maxNum);
    }
}
