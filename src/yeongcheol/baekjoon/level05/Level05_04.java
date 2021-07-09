package level05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
public class Level05_04 {
    // 3052번 - 나머지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> remainingSet = new HashSet<Integer>();
        for(int i=0; i<10; i++) remainingSet.add(Integer.valueOf(br.readLine())%42); 
        System.out.println(remainingSet.size());
    }
}
