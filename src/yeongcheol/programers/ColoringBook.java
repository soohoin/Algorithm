import java.util.LinkedList;
import java.util.Queue;

/**
 *  게임 맵 최단거리
 *  https://programmers.co.kr/learn/courses/30/lessons/1844
 */

class ColoringBook {

    public static void main(String[] args) {
        // int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        int[][] maps = {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}};
        System.out.println(new ColoringBook().solution(maps));
    }



    /**
     * BFS  넓이우선탐색을 통해 모든 좌표를 탐색하고 총 개수와 최소 개수를 return 한다.
     * 
     *
     * 
     *    
     */
    
    public int solution(int [][] maps) {
        
        // Queue를 생성하고 출발 위치를 넣어준다.  출발은 0,0  cost = 1
        Queue<Block> queue = new LinkedList<>();
        queue.offer(new Block(0, 0, 1));
        // return bfs(queue, maps);
        return 1;
    }

    public void bfs(Queue<Block> queue, int [][] maps) {

        boolean [][] isVisited = new boolean[maps.length][maps[0].length]; // 방문한 곳을 기록 
        Block currentBlock;
        int [][] ltrb = {{-1,0},{1,0},{0,-1},{0,1}};  // 상,하,좌,우
        int nextY, nextX, nextCost;                   // 다음좌표 Y,X cost
        int dX = maps[0].length-1;                    // 목표좌표 X
        int dY = maps.length-1;                       // 목표좌표 Y 
        isVisited[0][0] = true;                       // 최초 지점 방문확인

        while(!queue.isEmpty()) {

            currentBlock = queue.poll();              // 1. queue에 들어있는 좌표를 꺼낸다.
            
            // 2. queue에서 꺼낸 좌표가 마지막 위치면 목적지 도달! finish
            if(currentBlock.x == dX && currentBlock.y == dY)
                // return currentBlock.cost;

            // 3. 다음에 사용 할 cost를 +1 한다.
            nextCost = currentBlock.cost;
            // nextCost++;

            //  4. 상하좌우 이동 가능한 좌표를 찾아서 Queue에 넣어준다.  가능 한 좌표가 없거나 또는 최대 3개까지 가능함.
            for(int i=0; i<4; i++) {                                                   
                nextX = currentBlock.x + ltrb[i][0];
                nextY = currentBlock.y + ltrb[i][1];
                if( nextX < 0 || nextX > dX || nextY < 0 || nextY > dY ) continue;  // 배열을 벗어나면 패스
                if(isVisited[nextY][nextX]) continue; // 방문한 적이 있으면 패스
                if(maps[nextY][nextX] == 0) continue; // 길이 아니면 패스
                
                // 5. 방문 한 표시를 남겨서 다시 방문하지 않는다.
                isVisited[nextY][nextX] = true;
                
                // 1. 배열 index에 포함되고 , 2.방문한 적이 없고, 3.길이 맞으면 Queue에 Block을 만들어서 넣어준다.
                // queue.offer(new Block(nextX, nextY, nextCost));
            }
        }
        // return -1;
    }

    class Block {
        int y;
        int x;
        int cost;

        Block(int x, int y, int cost) {
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }


    
    
}

