package level02;
import java.util.Scanner;
public class Level02_05 {
    // 알람 시계
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();
        if(min >= 45) System.out.println(hour + " "+(min-45));
        else System.out.println((hour == 0 ? "23":hour-1) + " "+(min-45+60));
        
    }
}
