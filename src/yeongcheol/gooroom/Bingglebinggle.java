import java.io.*;

/**
 *  빙글빙글1
 *  https://level.goorm.io/exam/60331/%EB%B9%99%EA%B8%80%EB%B9%99%EA%B8%80-1/quiz/1
 */

public class Bingglebinggle {

    public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
        int [][] result = solution(input);
        for(int i = 0; i < result.length ; i++) {
            for(int j = 0; j < result[0].length ; j++) {
                if(result[i][j] == 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
	}

    /**
     * 1. 시작하는 좌표에 # 표시를 한다.
     * 2. 진행하고 있는 방향 * 2 가 배열의 index를 벗어나지 않고 # 인지 확인한다.
     *    true = 방향을 바꾼다. / continue
     * 3. 진행하고 있는 방향 * 1 이 배열의 index를 벗어났다면 
     *    true  = 방향을 바꾼다. / continue
     *    false = 위치를 이동한다. / turnCnt 를 0으로 초기화한다.
     */
    public static int[][] solution(int input) {

        int [][] arr = new int [input][input];

        int turnCnt = 0, y=0, x=0;     // turnCnt : 연속으로 회전한 횟수
        int direction = 0;             // 0:오른쪽 1:아래 2:왼쪽 3:위
        int [] moveX = {1,0,-1,0};     // direction에 따른 방향전환
        int [] moveY = {0,1,0,-1};     // direction에 따른 방향전환
        int nextOneY, nextOneX, nextTwoY, nextTwoX;

        arr[y][x] = 1;                 // 1. 시작하는 좌표에 # 표시를 한다.
        while(turnCnt < 2) {

            // 2. 진행하고 있는 방향 * 2 가 배열의 index를 벗어나지 않고 # 인지 확인한다.
            nextTwoY = y + (moveY[direction] * 2);
            nextTwoX = x + (moveX[direction] * 2);
            if( !(nextTwoY < 0 || nextTwoY > input-1 || nextTwoX < 0 || nextTwoX > input-1) && arr[nextTwoY][nextTwoX] == 1 ) {
                direction = ++direction % 4;
                turnCnt++;
                continue;
            }
            
            // 3. 진행하고 있는 방향 * 1 이 배열의 index를 벗어났다면 
            nextOneY = y + moveY[direction];
            nextOneX = x + moveX[direction];
            if( nextOneY < 0 || nextOneY > input-1 || nextOneX < 0 || nextOneX > input-1) {    // true  = 방향을 바꾼다. / continue
                direction = ++direction % 4;
                turnCnt++;
                continue;
            }

            switch(direction) {                                                                // false = 위치를 이동한다. / turnCnt 를 0으로 초기화한다.
                case 0: x++;
                    break;
                case 1: y++;
                    break;
                case 2: x--;
                    break;
                case 3: y--;
            }

            arr[y][x] = 1;
            turnCnt = 0;
        }

        return arr;
    }
}
