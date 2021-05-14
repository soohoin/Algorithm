import java.util.LinkedList;
import java.util.Queue;

/**
 *  게임 맵 최단거리
 *  https://programmers.co.kr/learn/courses/30/lessons/1844
 */
public class KakaoColoringBook {

    public static void main(String[] args) {
        
        int[][] picture = {{1,1,1,0},{1,2,2,0},{1,0,0,1},{0,0,0,1},{0,0,0,3},{0,0,0,3}};
        int[] answer = new KakaoColoringBook().solution(picture.length, picture[0].length, picture);
        for(int row : answer) {
            System.out.println(row);
        }
    }


    int numberOfArea = 0;      // 영역의 개수 
    int maxSizeOfOneArea = 0;  // 가장 큰 영역의 사이즈
    public int[] solution(int m, int n, int [][] picture) {
        boolean [][] visited = new boolean [m][n];
        for(int i=0; i<m ; i++) {
            for(int j=0; j<n ; j++) {
                bfs(picture,i,j,visited);
            }
        }
        int[] answer = new int [2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }


    public void bfs(int [][] picture, int y, int x, boolean [][] visited) {
        
        // 1. 방문한 적이 있다면 pass
        if(visited[y][x]) return; 
        
        // 2. 색칠하지 않는 영역(0) pass
        if(picture[y][x] == 0) {
            visited[y][x] = true;
            return;
        }

        Queue<Block> queue= new LinkedList<Block>();
        queue.offer(new Block(y, x));
        numberOfArea++;
        visited[y][x] = true;
        Block block;
        int crntColorNumber = 0;
        int crntY, crntX, areaSize, newY, newX;

        // 현재영역 카운트 1
        areaSize = 1;


        // 탐색을 시작한다.
        while(!queue.isEmpty()) {
            block = queue.poll();

            crntY = block.getY();
            crntX = block.getX();
            crntColorNumber = picture[crntY][crntX];

            // 동
            newY = crntY;
            newX = crntX+1;
            if(isVisitable(picture, newY, newX, visited, crntColorNumber)) {
                visited[newY][newX] = true;
                queue.offer(new Block(newY, newX));
                areaSize++;
            }

            // 서
            newY = crntY;
            newX = crntX-1;
            if(isVisitable(picture, newY, newX, visited, crntColorNumber)) {
                visited[newY][newX] = true;
                queue.offer(new Block(newY, newX));
                areaSize++;
            }

            // 남
            newY = crntY+1;
            newX = crntX;
            if(isVisitable(picture, newY, newX, visited, crntColorNumber)) {
                visited[newY][newX] = true;
                queue.offer(new Block(newY, newX));
                areaSize++;
            }

            // 북
            newY = crntY-1;
            newX = crntX;
            if(isVisitable(picture, newY, newX, visited, crntColorNumber)) {
                visited[newY][newX] = true;
                queue.offer(new Block(newY, newX));
                areaSize++;
            }
        }
        if(areaSize > maxSizeOfOneArea) maxSizeOfOneArea = areaSize;
    }

    public boolean isVisitable(int [][] picture, int y, int x, boolean[][] visited, int crntColorNumber) {

        // 배열의 영역이 아니면 pass 
        if(y < 0 || x < 0 || y > picture.length-1 || x > picture[0].length-1) return false;

        // 방문한 적이 있으면 pass
        if(visited[y][x]) return false;

        // 현재 block의 color 숫자와 같지 않다면 pass
        if(crntColorNumber != picture[y][x]) return false;

        // 색필하지 않는 영역 pass (다른 영역 에서도 방문 할 필요가 없기 때문에 visited에 표시한다.)
        if(picture [y][x] == 0) {
            visited[y][x] = true;
            return false;
        }

        return true;
    } 

    class Block {
        private int y;
        private int x;
        public Block(int y, int x) {
            this.y = y;
            this.x = x;
        }

        public int getY() {
            return this.y;
        }

        public int getX() {
            return this.x;
        }
    }
}
