public class NormalRectangle {
    
    public static void main(String[] args) {
        System.out.println(new NormalRectangle().solution(8, 8));
    }
    public long solution(int w, int h) {
        long answer = 0;
        for(int i=0; i<w; i++) {
            answer += h*i/w;
        }
        return answer * 2;
    }
}
