package basic.day02;

//캐스팅 (casting) : 데이터의 형식이 변환 되는것 
//          ㄴ 강제 캐스팅 : 변수 앞에 () 기호에 바꾸려는데이터 타입 키워드 
//데이터의 범위를 순서대로 나열 : byte < short < int < long < float < double
//          ㄴ 자동 캐스팅 : 
public class A06DataCasting {
    public static void main(String[] args) {
        //정수를 예시로 들면 정수는 기본타입이 int. 23은 둘다 int
        int a = 23;
        long b = 23;     //자동 캐스팅 (int 가 long으로)
        //정수 int 의 가장 마지막 값 : 2147493647 -> 1이라도 넘어가면 저장못함
        long lnum = 2147493648L; //인트 범위를 넘어가는 정수는 끝에 
        //Long에 저장하기 위해 L ( 리터럴 기호 ) 를  붙여준다

        //실수를 예시로 들면 실수는 기본 타입이 double.
        double d1 = 3.1419;
        float f1 = 3.1419F;
        //float 으로 저장하려면 리터럴 기호 사용 

        //정수와 실수의 관계 : 자동 캐스팅
        float f2 = 23;
        double f3 = 23;
        double b3 = 2147493648L;
        // d1 을 a라는 int 변수에 저장하고 출력하기 
        a = (int)d1;
        System.out.println("double d1 의 값 3.1419 를 int 로 강제 캐스팅 : " + a);
        //double 값을 int로 강제 캐스팅 했음으로 overflow 발생 , 값 손실 
    }

}
