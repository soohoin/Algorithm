package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level07_05 {
    // 1157 - 단어공부
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] charCntArray = new int[26];
        char[] charArray = br.readLine().toCharArray();
        int minus, maxNum, maxIndex = 0;
        
        for(int i=0; i<charArray.length; i++) {
            minus = charArray[i] > 90 ? 97 : 65;
            charCntArray[charArray[i] - minus]++;
        }
        maxNum = charCntArray[maxIndex];
        for(int i=1; i<charCntArray.length; i++) {
            if(maxNum < charCntArray[i]) {
                maxNum = charCntArray[i];
                maxIndex = i;
            } else if(maxNum == charCntArray[i]) {
                maxIndex = -2;
            }
        }
        System.out.println((char)(maxIndex + 65));
    }
}
