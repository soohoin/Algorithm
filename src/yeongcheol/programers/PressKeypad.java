
/**
 *  [카카오 인턴] 키패드 누르기
 *  https://programmers.co.kr/learn/courses/30/lessons/67256
 */

public class PressKeypad {
    public static void main(String[] args) throws Exception {
        
        int [] numbers1 = {1,3,4,5,8,2,1,4,5,9,5};
        int [] numbers2 = {7,0,8,2,8,3,1,5,7,6,2};
        int [] numbers3 = {1,2,3,4,5,6,7,8,9,0};


        PressKeypad app = new PressKeypad();
        System.out.println(app.solution(numbers1,"right"));

    }





    /*  T = 타겟, L = 왼손엄지, R = 오른손엄지
     *  
     * 1. T가 2,5,8,9 에 속하지 않으면 L과 R의 기본 선택번호화 순서대로 비교해서 터치
     * 2. T가 2,5,8,9 에 속하면 왼손거리 =  ( (|L-T|)/3 ) + ( (|L-T|)%3 )  
     *                       오른손거리 =  ( (|R-T|)/3 ) + ( (|R-T|)%3 )
     *                   를 각각 구한다.      
     * 3. 만약 T가 0이라면 11로 변환해서 값을 구한다.
     * 4. 구한 거리의 크기가 같으면 우선순위 손으로 터치하고 터치 한 손의 위치를 변경한다.
     * 5. 구한 거리의 크기가 다르면 가까운 손으로 터치하고 터치 한 손의 위치를 변경한다.
    */
    
    
    static int leftLocation    = 10;               // 왼손의 위치
    static int rightLocation   = 12;               // 오른손의 위치
    
    public String solution(int[] numbers, String hand) {
        
        int [] leftArea     = {1,4,7};          // 왼쪽 영역숫자
        int [] targetList   = {2,5,8,0};        // 경쟁영역 숫자 
        String defaultHand  = "left".equals(hand) ? "L" : "R"; // 기본으로 들어오는 손 변경저장
        StringBuffer result = new StringBuffer();              // 결과 버퍼
        
        //int leftDistance   = 0;
        //int rightDistance  = 0;
        int leftOrRight    = 0;       // 왼손거리 - 오른손거리
        int targetTemp     = 0;       // 터치 해야되는 숫자 

        
        for(int target : numbers) {
            
            if(isEasyChoice(target,targetList)) { // 경쟁영역의 숫자가 아닌 경우
                
                pressEasyChoice(target,leftArea,result); // 간단 버튼클릭 수행
            
            } else {  // 경쟁영역의 숫자인 경우                    
                
                targetTemp = (target == 0) ? 11 : target;      
                leftOrRight   = getDistance(leftLocation,targetTemp) - getDistance(rightLocation,targetTemp);
                pressHardChoice(leftOrRight,targetTemp,defaultHand,result);  // 경쟁영역의 숫자 버튼클릭 수행
            }   
        }
        return result.toString();
    }
    
    
    
    
    
    // 간단 버튼클릭 수행
    public void pressEasyChoice(int target, int [] leftArea, StringBuffer result) {
        if(isLeftTouch(target,leftArea)) {  // 왼손으로 터치
            result.append("L");
            leftLocation = target;
        } else {                            // 오른손으로 터치
            result.append("R");
            rightLocation = target;
        }
    }
    
    // 거리계산 후 버튼클릭
    public void pressHardChoice(int leftOrRight, int targetTemp,String defaultHand,StringBuffer result) {
        if(leftOrRight == 0) {
            result.append(defaultHand);

            if("L".equals(defaultHand)) {
                leftLocation = targetTemp;
            } else {
                rightLocation = targetTemp;
            }

        } else if(leftOrRight < 0) {
            result.append("L");
            leftLocation = targetTemp;
        } else {
            result.append("R");
            rightLocation = targetTemp;   
        }   
    }
    
    // 왼손에 해당 되는지 영역인지 체크한다.
    public boolean isLeftTouch(int compareNum , int [] leftArea) {
        for(int target : leftArea) {
            if(target == compareNum) return true;
        }
        return false;
    }
    
    
    // 거리 검사가 필요한지 체크한다.
    public boolean isEasyChoice(int compareNum, int[] targetList) {
        for(int target : targetList) {
            if(target == compareNum) return false;
        }
        return true;
    }
    
    // 두 숫자의 이동 거리를 계산한다.
    // 두 point의 거리 = ( (|L-T|)/3 ) + ( (|L-T|)%3 )
    public int getDistance(int point, int target) {
        int subStracAbsNum = Math.abs(point - target);
        return (subStracAbsNum/3) + (subStracAbsNum%3);
    }
    
}
