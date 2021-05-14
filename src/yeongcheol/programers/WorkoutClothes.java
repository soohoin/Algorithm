/**
 *  프로그래머스 - 체육복
 *  https://programmers.co.kr/learn/courses/30/lessons/42862
 */


class WorkoutClotes {

    public static void main(String[] args) {
        
        // 5, [1, 2, 3], [2, 3, 4]
        int [] lost = {1, 2, 3};
        int [] reserve = {2, 3, 4};
        System.out.println(new WorkoutClotes().solution(5, lost,reserve));
    }
    
    /* 
     * 1. lost 와 reserve에 동일 한 학생은 두 배열에서 전부 -1로 변경한다. 
     *   (잃어버린 학생이 여분이 있다면 자신이 써야 하므로 빌려 줄 수 없다.)
     * 2.  체육복을 잃어버린(lost) 수 만큼 반복을 해서 체육복을 빌려본다.
     * 3-1. 자신의 앞 번호가 있고 && 여분의 체육복이 있다면
     *       > lost cnt를 -1 하고 
     *       > reserve에서 앞 번호의 목록 값을 -1로 변경한다.
     *
     * 3-2. 자신의 뒷번호가 있고 && 여분의 체육복이 있다면  
     *       > lost cnt를 -1 하고 
     *      > reserve에서 뒷 번호의 목록 값을 -1로 변경한다.
     *      
     * 4. 체육수업을 들을 수 있는 학생의 수 =  학생 수(n) -  체육복을 잊어버리고 빌리지못한 학생수 (lost);
     */
    
    
    public int solution(int n, int[] lost, int[] reserve) {
        
        int headHitReserveIndex;    // 여분의 체육복이 있는 앞번호 학생의 배열 index
        int tailHitReserveIndex;    // 여분의 체육복이 있는 뒷번호 학생의 배열 index
        int lostCnt = lost.length;  // 체육복 도난당한 학생의 숫자
        int headStudentNum;         // 체육복이 없어진 학생의 앞번호
        int tailStudentNum;         // 체육복이 없어진 학생의 뒷번호
        
        for(int i=0; i<lost.length; i++) {            // 1. lost 와 reserve에 동일 한 학생은 두 배열에서 전부 -1로 변경한다. 
            for(int j=0; j<reserve.length; j++) {     // (잃어버린 학생이 여분이 있다면 자신이 써야 하므로 빌려 줄 수 없다.)
                if(lost[i] == reserve[j]) {
                    lost[i] = -1;
                    lostCnt--;
                    reserve[j] = -1;
                    break;
                }
            }    
        }
        
        // 2.  체육복을 잃어버린(lost) 수 만큼 반복을 해서 체육복을 빌려본다.
        for(int studentNum : lost) {
            if(studentNum == -1) continue;
            
            headStudentNum = studentNum-1;                                   // 한칸 앞의 학생번호
            headHitReserveIndex = getReserveIndex(headStudentNum, reserve);  // 한칸앞의 학생이 여분의 체육복이 있는지 

            // 3-1. 자신의 앞 번호가 있고 && 여분의 체육복이 있다면
            if(headStudentNum > 0 && headHitReserveIndex != -1) {
                lostCnt--;                                                   // lost cnt를 -1 하고 
                reserve[headHitReserveIndex] = -1;                           // reserve에서 앞 번호의 목록 값을 -1로 변경한다.
                continue;
            } 
            tailStudentNum = studentNum+1;                                   // 한칸 뒤의 학생번호
            tailHitReserveIndex = getReserveIndex(tailStudentNum, reserve);  // 한칸뒤의 학생이 여분의 체육복이 있는지
            
            // 3-2. 자신의 뒷번호가 있고 && 여분의 체육복이 있다면  
            if(tailStudentNum <= n && tailHitReserveIndex != -1) { 
                lostCnt--;                                                   // lost cnt를 -1 하고 
                reserve[tailHitReserveIndex] = -1;                           // reserve에서 뒷 번호의 목록 값을 -1로 변경한다.
            }
            
        }
        
        return n - lostCnt; // 체육수업을 들을 수 있는 학생의 수 =  학생 수(n) -  체육복을 잊어버리고 빌리지못한 학생수 (lost);
    }
    
    // 요청 된 studentNum 이 여분의 체육복이 있는지 확인하고 있으면 해당 index를 return하고 없으면 -1 return 
    public int getReserveIndex(int studentNum, int [] reserve) {
        for(int i=0; i<reserve.length; i++) {
            if(studentNum == reserve[i]) return i;
        }
        return -1;
    }
    
}