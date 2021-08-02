package level08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level08_02 {
    // 2292번 벌집
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int distance = 1;
        int checkNumber = 1;
        while(true) {
            if(n <= checkNumber) break;
            checkNumber += (distance) * 6;
            distance++;
        }
        System.out.println(distance);
    }
}
