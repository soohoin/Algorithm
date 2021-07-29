package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level07_10 {
    static int checkChar;
    static int currChar;
    static boolean [] wordCheckArray;

    // 1316번 그룹 단어 체커
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word;
        int total = 0;
        int loopCnt = Integer.valueOf(br.readLine());
        for(int i=0; i<loopCnt; i++) {
            word = br.readLine();
             total += isContinuousWord(word);
        }   
        System.out.println(total);
    }

    public static int isContinuousWord(String word) {
        wordCheckArray = new boolean[26];  // 0:a,  1:b,  ...
        checkChar = word.charAt(0) - 97;
        wordCheckArray[checkChar] = true;
        for(int j=1; j<word.length(); j++) {
            currChar = word.charAt(j) - 97;
            if( checkChar == currChar) {    
                continue;
            } else if(wordCheckArray[currChar]) {
                return 0;
            } else {
                wordCheckArray[currChar] = true;
                checkChar = currChar;
            }

        }
        return 1;
    }
}
