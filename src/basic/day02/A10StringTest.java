package basic.day02;

//문자열 저장 및 활용 : 자바에서 문자열은 String 클래스 타입
//                                  ㄴ참조타입 변수 (주소에 바로접근하지않고 참조 주소를 얻고 찾아감 *그림참고 )
//int, long, double, boolean 등은 기본형 (primitive) 데이터 타입.
public class A10StringTest {
    public static void main(String[] args) {
        //문자열을 저장하기 위한 변수 선언
        String message = "Hello~ Java. 자바";

        System.out.println(message);
        //문자열의 길이 : 문자 갯수

        System.out.println("message.length() : " + message.length ());
        //메소드의 인자 없음. 리턴 있음 (15)
       
        System.out.println("message.toUpperCase() : " + message.toUpperCase ());
        //대문자 변환
        
        System.out.println("message.toLowerCase() : " + message.toLowerCase());
        //소문자 변환 toLowerCase()

        System.out.println("message.charAt(4) : " + message.charAt(4));
        //메소드의 인자 있음 (4). 리턴도 있음 (0)
        System.out.println("message.indexOf(\"Java\"): " + message.indexOf("Java"));
        //변수 message의 특정 문자열의 시작 위치 찾기, 인자 (Java) index리턴 (7) 
        String result = message.concat("😋😋");
        //변수 message의 특정 문자열을 추가하고 
        System.out.println("result.length() : " + result.length());
        //문자열의 길이 변화 확인하기 (이모티콘)경우 글씨와 byte 가 달라 +2 됨 (영어와 한글의 바이트가 다르듯이)

        message.substring(3);
        message.substring(3,7);
        message.replace(" ", "**");
        message.startsWith("Hello");
        message.endsWith("Hello");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("message.substring(3) : " + message.substring(3)); //인덱스 3 부터 끝까지 추출
        System.out.println("------------------------------------------------------------------------");
        System.out.println("message.substring(3,7) : " + message.substring(3,7)); // lo~
        System.out.println("------------------------------------------------------------------------");
        System.out.println("message.replace(\" \", \"**\"): " + message.replace(" ", "**")); //공백을 ** 치환
        System.out.println("------------------------------------------------------------------------");
        System.out.println(" message.startsWith(\"Hello\") " + message.startsWith("Hello")); // 참 (대소문자 구분)
        System.out.println("------------------------------------------------------------------------");
        System.out.println("message.endsWith(\"Hello\") " + message.endsWith("Hello")); // 거짓
        System.out.println("------------------------------------------------------------------------");
        
        

        

    }
}
