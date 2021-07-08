package level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Level05_02 {
    // 2562번 - 최댓값
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int compareNum = 0;
        int maxIndex = 1;
        int maxNum = 0;
        for(int i=1; i<10; i++) {
            compareNum = Integer.parseInt(bf.readLine());
            if(maxNum < compareNum) {
                maxNum = compareNum;
                maxIndex = i;
            }
        }
        System.out.print(maxNum+"\n"+maxIndex);
    }
}
