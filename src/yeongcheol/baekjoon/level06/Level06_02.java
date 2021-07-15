package level06;

public class Level06_02 {  
    // 4673번 - 셀프 넘버
    public static void main(String[] args) {
        boolean[] results = new boolean[10001];
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=10000; i++) {
            results[d(i)] = true;
        }
        for(int i=1; i<=10000; i++) {
            if(!results[i]) sb.append(i).append("\n");
        }
        System.out.println(sb);
    }

    public static int d(int n) {
        int result = n;
        while(true) {
            result += n%10;
            n /= 10;
            if(n == 0 ) break;
        }
        return result > 10000? 0 : result;
    }
}
