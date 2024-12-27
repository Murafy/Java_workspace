package basic.day03;

public class A17CharTest {
    // 문자열은 "" 기호 안에 작성. 문자열 개수 (length)에 제한이 없다.
    // 문자는(Character) 는 '' 기호 안에 작성. 꼭 1개의 문자를 표기 
    // char 키워드로 타입 지정.  
    public static void main(String[] args) {
        char test_ch = 'a';
        System.out.println(String.format("테스트 문자 : %c %s", test_ch,test_ch));
        // 서식 문자 %c %s 둘다 사용가능 
        System.out.println(" === char 타입 변수 증감 연산자 테스트=== ");
        System.out.println(test_ch++);  // a 출력. test_ch는 'b'
        System.out.println(test_ch++);  // b 출력. test_ch는 'c'
        System.out.println(test_ch++);  // c 출력. test_ch는 'd'
        System.out.println(test_ch++);  // d 출력. test_ch는 'e'
        System.out.println(test_ch--);  // d 출력. test_ch는 'e'
        System.out.println(test_ch); //d 출력 
        //char 타입으로 실행할수 있는 산술 연산은 ++ 또는 -- 
        //+ 와 - 는 정수와 실수로만 가능
        ///////////////////////////////////////////////////////////
        // 문자는 각각 이진수값으로 표현해서 컴퓨터가 처리 합니다.
        //             이진수값을 만드는 체계에 따라 여러 인코딩 방식이 있습니다.
        // 현재 UTF-8 인코딩 방식을 사용함

        int code = (int)test_ch; // char -> 98
        // int 21억 / char 65535 고로 자동 캐스팅
        // char 를 int 로 타입 변환하면서 코드값 저장.
        System.out.println(code);

        code +=2; // 98 -> 100
        System.out.println(String.format("%c",code)); 
        //code 정수값에 해당되는 문자가 있으면 정수를 문자로 출력 

        System.out.println("퀴즈으으으으으으으으으으");
        char ga = '가';
        char hit = '힣';

        int result = (int)ga;
        int hitsult = (int)hit;
        System.out.println("문자 \'가\' 의 정수형은 " + result + " 이고." + "문자 \'힣\' 의 정수형은 " + hitsult + "입니다.");
        hitsult -= result;
        System.out.println("문자 \'가\' 와 \'힣\' 사이의 문자 갯수는" + hitsult + "개 입니다");

        System.out.println(String.format("가 = %d , %x ", hitsult,hitsult));
        System.out.println(String.format("가 = %d , %x ", result,result));

        System.out.println(String.format("%c", 50000));
        // 문자정수 50000번째 문자 뽑아오기 %c 
        
        int some = 80000;
        char some_code = (char)some; // int(정수) -> char(문자) 로 강제 캐스팅 
        System.out.println(some_code);
        }
}
