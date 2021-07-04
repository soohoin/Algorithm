package level02;

import java.io.IOException;
import java.util.Scanner;

public class Level02_01 {
    // 두 수 비교
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        String result = "";
        result = numA > numB ? ">" : numA < numB ? "<" : "=="; 
        System.out.println(result);        
    }
    
}
