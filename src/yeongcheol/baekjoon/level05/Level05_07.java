package level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Level05_07 {
    // 4344번 - 평균은 넘겠지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int n = Integer.valueOf(br.readLine());
        double total, average;     
        int aboveStudentCnt;       // 평균점수 초과 학생수
        for(int i=0; i<n; i++) {
            total = 0.0;
            st = new StringTokenizer(br.readLine());
            aboveStudentCnt = 0;
            double [] scoreArray = new double[Integer.valueOf(st.nextToken())];  // 하나의 테스트 케이스의 학색들 점수를 담는 1차원 배열
            for(int j=0; j<scoreArray.length; j++) {
                scoreArray[j] = Integer.valueOf(st.nextToken());
                total += scoreArray[j];    // 점수 합산
            }
            average = total/scoreArray.length; // 평균
            for(double score : scoreArray) {   // 평균이상 count
                if(score > average)
                    aboveStudentCnt++;
            }
            System.out.println(String.format("%.3f",(aboveStudentCnt/Double.valueOf(scoreArray.length)) * 100)+"%");
        }
    }
}