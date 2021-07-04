package level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
public class Level03_10 {
    // 2439번 - 별 찍기 - 2
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        StringBuffer sbfStar = new StringBuffer();
        StringBuffer sbfEmpty = new StringBuffer();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(bf.readLine());

        // sbf.delete(0, 1)
        for(int i=0; i<num; i++) sbfEmpty.append(" ");
        for(int i=0; i<num; i++) bw.write(sbfEmpty.deleteCharAt(0).toString()+sbfStar.append("*").toString()+"\n");
        bw.close();
    }
}
