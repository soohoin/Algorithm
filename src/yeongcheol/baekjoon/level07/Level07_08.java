package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level07_08 {
    // 5622번 - 다이얼
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sec = 0;
        int compareNumber;
        for(int i=0; i<str.length(); i++) {
            compareNumber = str.charAt(i)-64;
            if(compareNumber < 4) sec += 3;
            else if(compareNumber < 7) sec += 4;
            else if(compareNumber < 10) sec += 5;
            else if(compareNumber < 13) sec += 6;
            else if(compareNumber < 16) sec += 7;
            else if(compareNumber < 20) sec += 8;
            else if(compareNumber < 23) sec += 9;
            else sec += 10;
        }
        System.out.println(sec);
    }
}
