//class Car {
//    private int serialNumber;    // 다른 클래스에서 접근 불가
//    protected String name;
//    int speed;          // class 부분에 오른쪽 클릭하고 'Generate'를 눌러서, 변수에 대해 getter와 setter 메서드를 자동으로 작성해주는 기능이 있다!!
//
//    @Override                   // Generate 메뉴에서 toString()을 누르면 변수값을 나열해주는 toString()메서드를 자동 작성할 수 있다.
//    public String toString() {
//        return "Car{" +
//                "serialNumber=" + serialNumber +
//                ", name='" + name + '\'' +
//                ", speed=" + speed +
//                '}';
//    }
//
//
//    public int getSerialNumber(int managerID) {  // serialNumber가 private로 선언되었지만 같은 클래스 내부에서 해당 변수에 접근 가능한 메서드를 선언
//        if (managerID == 12345) {       // 매니저아이디를 입력받아서, 그와 일치할 시 get메서드는 시리얼넘버를 리턴한다.
//            return serialNumber;          // @@@@@@ 이렇게 private 변수를 받아오는 메서드를 "getter메서드" 라고 통칭한다.
//        }
//        return 0;       // 틀리면 0을 리턴
//    }
//    public void setSerialNumber(int serialNumber){      // 마찬가지로 시리얼넘버에 접근 가능한 public 메서드를 선언해서, 시리얼넘버를 입력받을 수 있음
//        this.serialNumber = serialNumber;       // void이기 때문에 return이 필요없음. this. 는 파이썬에서의 self에 해당. this.를 통해 set메서드에 명시된 시리얼넘버 변수를 지칭함을 명시
//    }                             // @@@@@@@@마찬가지로 이렇게 private 변수를 설정하는 메서드를 "setter메서드"라고 통칭한다.
//
//}

public class SWEA_2 {
    public static void main(String args[]) {


//
//        Car Yellow = new Car();
//        Yellow.name = "Light";      // name은 같은 패키지라서 접근 가능
//        Yellow.speed = 300;     // default니까 접근 가능
        /////////////////////////Yellow.serialNumber = 3040;  // 이거 각주 풀면 에러뜸
//        Yellow.setSerialNumber(4929);   // !!!!!!!!!! 대신, Car 클래스에서 public으로 선언한 set메서드를 이용한다면 시리얼넘버를 내맘대로 지정할 수 있게 됨
//        System.out.println(Yellow.name + " : " + Yellow.speed); // 여기서 serialNumber는 프린팅도 못함. private로 보호되어있기 때문
//        System.out.println("Car No: " + Yellow.getSerialNumber(12345));     // !!!!!!!!! 대신, get 메서드를 이용한다면 시리얼넘버 프린팅이 가능함.
//        System.out.println(Yellow.toString());      // toString으로 정보를 확인하는 방법.
//


        // 클래스는 프로그램의 가장 기본적인 요소. 메모리 상 객체인 인스턴스를 생성하기 위한 템플릿.
        // 인스턴스는 객체가 메모리에 올라간 것. 메모리 상의 객체. 사실상 객체와 동의어
        // 객체는 현실 세계에 존재하는 유무형의 모든 것. 사람들이 의미를 부여하고 분류하는 논리적인 단위
        // 추상화는 현실의 객체들의 공통적 특성을 모아 일반화하는 것. 클래스 정의 시 핵심
        // 다형성은 동일 인터페이스를 이용해 서로 다른 구현 객체를 일관된 방법으로 사용할 수 있게 함. 프로그램 유지보수성 향상. 나중에 자세히 이해
        // 상속은 클래스들을 계층 구조화하여 기존의 클래스 변수와 메서드를 재사용하는 방식.
        // 정보은닉은, 클래스 속 변수와 메서드를 선택적으로 공개하거나 숨기는 기법. private와 public으로 선언 가능
        // 캡슐화는, 하나의 클래스 안에 변수와 메서드를 하나로 묶어 서로 독립적으로 동작하지 않도록 하는 그 자체를 뜻하는 말



//        class Car {
//            String name;         // Car 클래스에 name, currentSpeed, currenGear의 속성 부여
//            int currentSpeed;
//            int currentGear;
//            void start(){       // 메서드 start 선언
//                System.out.println(name + "의 시동켠다");
//                currentSpeed = 1;
//            }
//            void changeGear(int gear){   // 메서드 changeGear 선언. void로 선언하면 return이 필요없다고 하는데 아직 제대로 이해못함
//                System.out.println("기어를"+gear+"단으로변경");
//                currentGear = gear;
//            }
//            int getCurrentSpeed() {     // 메서드 선언. int로 선언했으니까
//                currentSpeed += currentGear * 10;
//                return currentSpeed;           // return을 통해 int값인 currentSpeed를 토해내야함. 이거를 getCurrentState를 통해 스트링형태로 프린트하는게 필요
//            }
//            void stop() {
//                System.out.println(name+"의 시동끈다");
//                currentSpeed = 0;
//                currentGear = 0;
//            }
//            String getCurrentState(){       // 마찬가지로 String을 토해내야 함
//                return name + "의 현재 속도: " + getCurrentSpeed();      // return을 통해 getCurrentSpeed() 메서드로 돌아감
//            }
//        }
//        Car myCar = new Car();      // Car 클래스의 인스턴스로 myCar 선언
//        myCar.name = "Red";         // 속성 설정
//        myCar.currentGear = 0;
//        myCar.currentSpeed = 0;
//
//        myCar.start();
//        System.out.println(myCar.getCurrentState());
//        myCar.changeGear(2);
//        System.out.println(myCar.getCurrentState());
//        myCar.changeGear(3);
//        System.out.println(myCar.getCurrentState());
//        myCar.stop();
//        System.out.println(myCar.getCurrentState());



//        class Taxi extends Car {        // 위에있는 Car 클래스 활성화 시, 새로운 Taxi 클래스는 Car의 모든 변수와 메서드를 상속받는다. extends를 사용
//            int fare;       // 새로운 변수도 선언 가능
//            boolean passengerYn;
//        }     // 자바에서는 다중상속이 지원 안됨. 하나의 클래스는 하나의 상위 클래스만을 가질 수 있음
//        Taxi myTaxi = new Taxi();
//        myTaxi.name = "308";
//        myTaxi.currentGear = 2;
//        myTaxi.fare = 3400;
//        myTaxi.passengerYn = true;
//        System.out.println(myTaxi.getCurrentState());       // 아까와 같은 느낌으로 사용 가능





// Modifier에 대해서는 따로 정리해서 활용하는 게 필요하다.
        // 접근권한과 활용방법을 각각 표시할 수 있는데, class, 변수, 메서드에 붙일 수 있는 modifier가 각각 정해져있고 효과도 제각각이다. 따로 정리된 문서를 참고해야 할 것



//        int enScore[] = {55,70,45,90,100,90,95};
//        System.out.println("영어 평균: " + getAvgScore(enScore));       // 메인메서드에서 get메서드를 호출.
//        int koScore[] = {93,55,87,80,100,95,65};
//        System.out.println("국어 평균: " + getAvgScore(koScore));
//    }
//    private static double getAvgScore(int scoreList[]){     // 메인메서드와 별개로 get 메서드를 정의. int 형식의 scoreList[]를 매개변수로 받는 메서드
//        int sum = 0;
//        double avgScore = 0.0;
//        for (int i=0; i<scoreList.length; i++){
//            sum += scoreList[i];
//        }
//        avgScore = (double)sum/scoreList.length;        // double로의 변환자 포함시키는 거 주의
//        return avgScore;        // double 메서드이므로 return값이 필수. 계산된 avg 값이 메인메서드에서 구현됨






    }
}

