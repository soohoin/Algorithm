package level06;

public class Level06_01 {  // 제출 시 클레스명 = Test
    // 15596번 - 정수 N 개의 합
    long sum(int[] a) {
        long sum = 0;
        for(int num : a){
            sum += num;
        }
        return sum;
    }
}