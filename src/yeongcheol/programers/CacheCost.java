/**
 *  캐시
 *  https://programmers.co.kr/learn/courses/30/lessons/17680
 */


class CacheCost {

    public static void main(String[] args) {
        
        // 5, [1, 2, 3], [2, 3, 4]
        int cacheSize = 3;
        String [] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};
        System.out.println(new CacheCost().solution(cacheSize, cities));
    }
    
/*
        도시 이름만큼 반복하면서 비용을 측정한다.
        
        1. 도시이름을 캐시에서 있는지 찾아본다.
           1-1. 있다면
              > cost++
              > 캐시블럭의 index를 최신으로 update 한다. 
           
           1-2. 없다면 
           
    
    */
    
    public int solution(int cacheSize, String[] cities) {
        int totCost = 0;
        int recentlyIndex = 0;    // 가장 최근의 index값  
        int oldIndex = 0;         // 가장 오래된 index값 - 교체대상
        boolean isHit;            // 캐시 적중여부
        int cacheInsertCnt = 0;   // 캐시에 적재 한 개수 
        CacheBlock [] cacheBlocks = new CacheBlock[cacheSize];
        
        for(String city : cities) {
            isHit = false;
            

            // 캐시에 있는지 확인
            for(CacheBlock block : cacheBlocks) {
                
                if(block != null && block.city.equals(city) ) {  // 캐시 hit
                    totCost++;
                    block.index = ++recentlyIndex;
                    isHit = true;    
                }
            }
            
            // 캐시에 없다면 
            if(!isHit) {
                totCost += 5;

                // 캐시가 꽉 차지 않았다면 비어있는 자리에 넣어준다.
                if(cacheInsertCnt != cacheSize ) {
                    for(CacheBlock block : cacheBlocks) {
                        if(block == null) {
                            block = new CacheBlock(++recentlyIndex, city);
                            cacheInsertCnt++;
                        }
                    }

                // 캐시가 꽉 차있다면 가장 오래된 index를 교체해 준다.    
                } else {
                    int index =0;
                    int minIndex = recentlyIndex;
                    int realArrayIndex = 0;
                    for(CacheBlock block : cacheBlocks) {
                        index++;
                        if(minIndex > block.index)  {
                            minIndex = block.index;
                            // realArrayIndex = 
                        }
                            
                        cacheInsertCnt++;
                    }

                }
                
            }
            
            
            
        }
            
        
        
        int answer = 0;
        return answer;
    }
    
    
    class CacheBlock {
        int index;
        String city;
        
        public CacheBlock(int index, String city) {
            this.index = index;
            this.city = city;
        }
    }
    
}