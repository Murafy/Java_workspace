package basic.day01;
//메소드는 함수와 같은 리턴값, 인자 등을 갖고 있음
//         함수와 다른 점은 객체 또는 클래스의 구성요소라는 것임
public class A03MethodTest {
    public static void main(String[] args) {
        System.out.println("main 메소드 실행 중");
        // 다른 메소드 실행 (호출)
        hello();
        say("하이하이");
        // say(100); 오류 : 인자의 데이터 타입 불일치 String 타입만 가능 

        int result = multiply(30, 20);
        System.out.println("multiply(30,20)) = " + result);
        System.out.println("multiply(99999,99999)" + multiply(99999, 56789));
        //                     ㄴ 계산기는 5,678,843,211 결과는 1,383,875,915 (overflow) 
        //                     ㄴ 리턴 타입이 int (21억) 이므로 오버플로우 발생 , 정확한 값이 아니라 남는 값 리턴
        //리턴값이 있는 메소드는 변수에 저장해야함

        result = multiply(99999, 56789);
        //변수에 저장 하든말든 오버플로우 값은 똑같음 
        System.out.println("multiply(99999,56789) 변수에 저장했을 시 : " + result);
        System.out.println("main 메소드 종료!!");

        System.out.println("multiplylong!! : " + multiplyLong(99999, 56789));
        //                     ㄴ리턴 타입이 long (9.22경) 이므로 오버플로우 발생 X , 정확한 값
    }
    //리턴값이 없는 메소드 void
    public static void hello(){
        System.out.println("hello 메소드 실행중입니다");
        System.out.println("~~~");
        System.out.println("hello 메소드 종료!!");

    }
    //인자를 갖는 메소드 
    public static void say(String message){
        System.out.println("hello 메소드 실행중입니다");
        System.out.println("~~~" +message);
        System.out.println("hello 메소드 종료!!");

    }
    //리턴값, 인자를 갖는 메소드 : 두 개의 정수를 전달 받아서 곱하기 결과를 리턴한다.
    //int = 약 21억
    public static int multiply(int x , int y){
        System.out.println("두개의 정수를 곱하는 메소드 multiply 실행중");
        return x*y;
    }

    //리턴값, 인자를 갖는 메소드 : 두 개의 정수를 전달 받아서 곱하기 결과를 리턴한다.
    //long = 약 9.22경 
    public static long multiplyLong(int x , int y){
        System.out.println("두개의 정수를 곱하는 메소드 multiply 실행중");
        return (long)x*y;
        }

    
}
