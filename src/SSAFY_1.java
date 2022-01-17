import java.util.Random;    // Random 클래스 임포트

public class SSAFY_1 {
    public static void main(String args[]) {
//        int sum = 0;
//        int cnt = 100;
//        double avg = 0;
//        Random rand = new Random();
//        for(int i = 0; i < cnt; i++) {
//            sum += rand.nextInt(6)+1;
//        }
//        avg = (double)sum / cnt;    // 제대로 된 평균값 도출을 위해서는 형변환이 필수적
//        System.out.printf("sum:%d, avg: %f%n", sum, avg);   // printf는 format에 해당. %d는 정수, %f는 실수, %n은 개행



        for (int i = 5; i>=0; i--) {
            for (int j = 0; j<i; j++){  // 이중반복문 활용...
                System.out.print("#");
            }
            System.out.println();
        }


        for (int i = 0; i<5; i++) {
            for (int j = 0; j<i; j++ ) {
                System.out.print(" ");
            }
            for (int j = 9-2*i; j>0; j--) {
                System.out.print("#");
            }
            System.out.println();
        }



    }
}
