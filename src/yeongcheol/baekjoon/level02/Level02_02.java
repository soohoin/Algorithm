package level02;

import java.io.IOException;
import java.util.Scanner;

public class Level02_02 {
    // 시험성적

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        switch(score / 10) {
            case 10: case 9: System.out.println("A"); break;
            case 8: System.out.println("B"); break;
            case 7: System.out.println("C"); break;
            case 6: System.out.println("D"); break;
            default: System.out.println("F"); 
        }

    }
    
}
