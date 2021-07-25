package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Level07_06 {
    // 1152 - 단어의 개수
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String words = br.readLine().trim();
        if(words.isEmpty()) System.out.println(0);
        else System.out.println(words.split(" ").length);
    }
}
