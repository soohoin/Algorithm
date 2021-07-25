package level07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Level07_07 {
    // 2908번 - 상수
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int firstNum = reverse(Integer.valueOf(st.nextToken()));
        int secondNum = reverse(Integer.valueOf(st.nextToken()));
        System.out.println(firstNum > secondNum ? firstNum : secondNum);
    }
    public static int reverse(int number) {
        return ((number%10)*100) + ((number/10%10)*10) + (number/100);
    }
}
