package level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Level05_05 {
    // 1546번 - 평균 스페셜 저지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int subjectCnt = Integer.valueOf(br.readLine());
        int subjectScore, maxScore = 0;
        double sum = 0.0; 
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<subjectCnt; i++) {
            subjectScore = Integer.valueOf(st.nextToken());
            if(subjectScore > maxScore) maxScore = subjectScore;
            sum += subjectScore;
        }
        System.out.println((sum/maxScore * 100)/subjectCnt);
    }
}
