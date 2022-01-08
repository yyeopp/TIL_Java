public class SWEA {
    public static void main(String[] args) {    // main() 메서드는 자바에 있어야하는 특수한 메서드. main 메서드 내에서 다른 클래스와 객체, 메서드를 호출하고 조작할 수 있음. 무조건 들어가야한다는 뜻
        // main()의 매개변수는 String 타입의 배열. 내가 이 뒤에 작성하는 모든 코드들은 어쨌든 '문자'이기 때문에 String 타입이라고 선언하는 것.
        // arg[]는 명령행 매개변수. 공백을 구분자로 하여 여러 개의 값을 전달하게 됨. 코드에서 ;를 다는 것이 그런 기능 아닐까?
        // "Run configuration" 창에서 Program arguments 부분에 문자열이나 int 배열을 써놓으면, 그게 해당 class의 기본값이 되어 호출해올 수도 있다.
        // 이런 번거로운 짓을 하는 이유는, 자바가 기본적으로 파이썬에는 있던 input함수를 제공하지 않고 import해와야하기 때문. input을 argument에다가 써야한다고 이해하면 된다.
//        int [] javalist = new int [5];
//        javalist [0] = Integer.parseInt(args[0]);   // 이렇게 해놓고 argument 에 다섯개 정수를 공백으로 구분해서 써놓으면, 그 중 첫번째가 "string" 타입으로 접수된 후 parseInt 함수에 의해 int로 변환, javalist 0번 순서에 저장되는 것.
//        System.out.println(javalist[0]);

        // 결과적으로, main 메서드가 문자열의 배열을 매개변수로서 받아 프로그램 실행 시 필요한 정보를 프로그램에 전달하는 구조



//        int num1 = 3;
//        double calc;
//        calc = (double)num1 / 4;    // 원래 int인 num1을 double로 변환해주는 (double) 변환자를 붙여야 제대로 된 계산이 가능함
//        System.out.println(calc);

        //        String a = new String("hello");
//        System.out.println(a);
//
//        int scorelist[] = new int[5];   // scorelist를 배열로 선언, int들의 배열로서 길이는 5라고 설정함
//        scorelist = new int[] {1,2,3,4,5};  // 이렇게 직접 바로 설정가능하다는 것.
//        System.out.println(scorelist);      // 근데 왜 결과가 이상하게나오지
//        int scorelist[] = new int[100];    // scorelist가 길이 100의 int 배열임
//        scorelist[0] = 1;       // 배열의 첫번째를 1로
//        scorelist[99] = 100;        // 배열의 마지막을 100으로
//        System.out.println(scorelist[0]);   // 출력.
//        System.out.println(scorelist.length);   // 배열의 길이를 불러오는 함수.
//
//
//        String namelist[] = new String[5];  // string에 대해서도 동일하게 사용 가능
//        namelist[0] = "A";
//        namelist[4] = "E";
//        System.out.println(namelist[0]);



//        int scorelist [][] = new int[3][3];     // 다차원 배열을 선언. 2차원 배열로써 3*3=9 개의 원소를 가짐. 행렬과 비슷
//
//        int list2 [][] = new int[3][];
//        list2 [0] = new int[2];
//        list2 [1] = new int[3];     // 이런식으로 꼭 정방형이 아니여도 됨. 첫줄은 2개, 둘째줄은 3개 이런식으로 지정
//        list2 [2] = new int[4];     // 대신 하나하나 잘 지정해야 할 것.
//        System.out.println(list2[1].length);    // 3

// ===================================================

//        int num = 9;
//        if(num%2 ==0){      // if문 쓰는 방법.
//            System.out.println(num+"은 짝수");
//        }   // else 전에 else if(){} 를 (여러개)사용할 수도 있다.
//        else {      // else도 파이썬과 비슷한 느낌으로 사용 가능
//            System.out.println(num + "은 홀수");
//        }


//        int a = 11;    // switch안에는 chr, int, byte, short만 들어갈 수 있음.
//        switch (a) {    // switch를 통해 다중 분기가 가능. a에 입력하는 값에 따라 각 case에 해당하는지 검사해서 내부의 함수를 출력.
//            case 9:    // 여기에 뭐 >5 같이 boolean을 유발하는 문장을 집어넣으면 안됨. 그냥 expression에 선언된 자료형과 같은 값을 직접 입력
//                System.out.println("9");
//                break;  // 반드시 각 case에 대해 break를 해줘야 함. 안그러면 다음 case로 제멋대로 넘어간다
//            case 10:
//                System.out.println("10");
//                break;
//            case 11: // break 없으면 다음 케이스로 넘어간다는 점을 이용해서, 이렇게 구성할 수도 있음.
//            case 12:
//                System.out.println("11, 12");   // 11을 넣으면 case 12 까지 와서 11,12 출력력                break;
//            default:   // 모든 case에 해당하지 않을 때 default가 실행됨. 여기서도 break가 들어가야 하지만 "다음 case"가 없어서 큰 문제는 안 생김
//                System.out.println("아무거나");



//for(초기식; 조건식; 증감식) {
//Statement1;
//]
//statement2;
//
//초기식에 대해 조건식이 true이면 statement1을 수행, 증감식을 적용,
//다시 조건식이 true인지 확인.
//증감식이 없으면 조건식과 statement1 사이의 무한루프가 발생.
//조건식이 false가 될 시 이제 statement2 수행.

        // for 블록 내의 변수는 외부에서 호출이 불가능. for가 함수인지는 애매하지만 그 내부 지역변수다.. 라고 생각.
        // for문에서는 외부에 있는 변수를 끌어다쓰는게 가능하다.


//        int sum = 0;
//        for (int i = 1; i <= 100; i ++){
//            if (i%2 == 0) {
//                sum += i;   // for 밖에 있는 sum을 갖다씀.
//            }
//        }
//        System.out.println("짝수 총합 " + sum);  // 여기서 i를 운운할 수 없다는 뜻



//        for (int i = 1; i <= 10; i ++){     // 이중반복문의 구조.
//            for (int j = 1; j <= i; j ++) {
//                System.out.printf("*");   // 이건 j개의 *을 서로 붙이기 위함
//            }
//            System.out.println("");   // 이건 j에 대해 for 반복이 한번 돌아가고 i가 한번 늘어나기 전에 개행을 주기 위함.
//        }






    }
}
