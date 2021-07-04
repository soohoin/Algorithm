import java.io.*;

/**
 * 새로운 암호화
 * https://level.goorm.io/exam/49090/%EC%83%88%EB%A1%9C%EC%9A%B4-%EC%95%94%ED%98%B8%ED%99%94/quiz/1 
 */


public class Encryption {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] inputArr = br.readLine().split(" ");
        
        long firstKey = Long.parseLong(inputArr[0]);
        long secondKey = Long.parseLong(inputArr[1]);
        // firstKey 가 4로 나눈 나머지 0,1,2,3 일 때 각각 패턴이 존재한다.

        long answer = firstKey;

        for(long i=firstKey+1; i<=secondKey ; i++) {
            answer ^= i;
            System.out.println(answer);
        }
        System.out.println("end : ");
        System.out.println(answer);

        // switch((int)firstKey % 4) {
        //     case 0:
        //     case 1:
        //         switch((int)secondKey % 4) {
        //             case 0:
        //                 System.out.println(secondKey);
        //                 break;
        //             case 1:
        //                 System.out.println(1);
        //                 break;
        //             case 2:
        //                 System.out.println(secondKey + 1);
        //                 break;
        //             case 3:
        //                 System.out.println(0);
        //                 break;
        //         }
        //         break;
        //     case 2:
        //         switch((int)secondKey % 4) {
        //             case 0:
        //                 System.out.println(secondKey + 1);
        //                 break;
        //             case 1:
        //                 System.out.println(0);
        //                 break;
        //             case 2:
        //                 System.out.println(secondKey);
        //                 break;
        //             case 3:
        //                 System.out.println(1);
        //                 break;
        //         }
        //         break;
        //     case 3:
        //         switch((int)secondKey % 4) {
        //             case 0:
        //                 System.out.println(secondKey + 3);
        //                 break;
        //             case 1:
        //                 System.out.println(2);
        //                 break;
        //             case 2:
        //                 System.out.println(secondKey - 2);
        //                 break;
        //             case 3:
        //                 System.out.println(3);
        //                 break;
        //         }
        // }
    }
}

    //     public static void main(String[] args) throws Exception {
    //     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //     String []input = br.readLine().split(" ");
    //     // xor은 둘이 같으면 0 다르면 1

    //     long start = Long.parseLong(input[0]);
    //     long end = Long.parseLong(input[1]);
    //     long role;

    //     // X^Y^X = Y

    //     long tmp = 0;
    //     role = start%4;
    //     switch((int)role){
    //         case 0:{
    //             tmp = start;
    //             break;
    //         }
    //         case 1:{
    //             tmp = 1;
    //             break;
    //         }
    //         case 2:{
    //             tmp = (start +1);
    //             break;
    //         }
    //         case 3:{
    //             tmp = 0;
    //             break;
    //         }
    //     }
    //     role = end%4;

    //     switch((int)role){
    //         case 0:{
    //             tmp ^= end;
    //             break;
    //         }
    //         case 1:{
    //             tmp ^= 1;
    //             break;
    //         }
    //         case 2:{
    //             tmp ^= (end +1);
    //             break;
    //         }
    //         case 3:{
    //             tmp ^= 0;
    //             break;
    //         }
    //     }
    //     System.out.println(tmp^start);
    // }
// }

    
