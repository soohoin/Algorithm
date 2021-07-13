package level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Level05_07 {
    // 4344번 - 평균은 넘겠지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
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
            //sb.append(String.format("%.3f",(aboveStudentCnt/Double.valueOf(scoreArray.length)) * 100)+"%\n"); // 한 테스트 케이스의 결과저장
        }
        //System.out.println(sb);
    }
}

/**
 * 40.000%
57.143%
33.333%
66.667%
55.556%
 * 
 */



 /**
  * 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        DecimalFormat df = new DecimalFormat("#.###");
        StringTokenizer st;
        int n = Integer.valueOf(br.readLine());
        double [][] scoreArray = new double[n][];
        double total;
        int studentCnt;
        for(int i=0; i<n; i++) {
            total = 0.0;
            st = new StringTokenizer(br.readLine());
            studentCnt = Integer.valueOf(st.nextToken());
            scoreArray[i] = new double[studentCnt+1];
            for(int j=0; j<studentCnt; j++) {
                scoreArray[i][j] = Integer.valueOf(st.nextToken());
                total += scoreArray[i][j];
            }
            scoreArray[i][studentCnt] = total/Double.valueOf(studentCnt);
        }
        int cnt;
        for(int i=0; i<scoreArray.length; i++) {
            cnt = 0;
            for(int j=0; j<scoreArray[i].length-1; j++) {
                if(scoreArray[i][j] > scoreArray[i][scoreArray[i].length-1])
                    cnt++;
            }
            sb.append(df.format(cnt/Double.valueOf(scoreArray[i].length-1) * 100)+"\n");
        }
        System.out.println(sb);
    }


  */