package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level07_09 {
    
    // 5622번 - 다이얼
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int cnt = 0;
        int startIndex = 0;
        int endIndex = str.length()-1;
        while(startIndex <= endIndex) {
            startIndex += nextStartLocation(str,startIndex,endIndex);
            cnt++;
        }
        System.out.println(cnt);
    }

    public static int nextStartLocation(String str, int startIndex, int endIndex) {
        if(startIndex == endIndex) return 1;

        int compareCharacter = str.charAt(startIndex);
            // =(61), -(45), j(106)
            switch(compareCharacter) {
                case 99: // c
                    compareCharacter = str.charAt(startIndex+1);
                    if(compareCharacter == 61 || compareCharacter == 45) return 2;
                    return 1;
                case 100: // d
                    compareCharacter = str.charAt(startIndex+1);
                    if(compareCharacter == 45) return 2;
                    else if( endIndex - startIndex != 1 && compareCharacter == 122 && str.charAt(startIndex+2) == 61) return 3;
                    return 1;
                case 108: // l
                    if(str.charAt(startIndex+1) == 106) return 2;
                    return 1;
                case 110: // n
                    if(str.charAt(startIndex+1) == 106) return 2;
                    return 1;
                case 115: // s
                    if(str.charAt(startIndex+1) == 61) return 2;
                    return 1;
                case 122: // z
                    if(str.charAt(startIndex+1) == 61) return 2;
                    return 1;
            }
        return 1;
    }
}
