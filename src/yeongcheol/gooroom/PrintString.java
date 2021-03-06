import java.io.*;

/**
 *  문자열 번갈아 출력
 *  https://level.goorm.io/exam/43110/%EB%AC%B8%EC%9E%90%EC%97%B4-%EB%B2%88%EA%B0%88%EC%95%84-%EC%B6%9C%EB%A0%A5%ED%95%98%EA%B8%B0/quiz/1
 */

class PrintString {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int start = 0;
		int end = input.length()-1;
				
		while(true) {
			System.out.print(input.charAt(start++));
			System.out.print(input.charAt(end--));
			
			if(start == end ) {
				System.out.print(input.charAt(start));
				break;
			} else if(start > end) {
				break;
			}
		}
	}
}