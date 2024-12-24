public class A01DataTest {
    
    public static void main(String[] args){

        //1. 데이터 저장
        int myage = 23;
        double weight = 60.23;
        boolean isAdult;
        char loc_code = 'A'; // 지역코드 (_표기 snake 표기법)

        //2. 출력 (확인)
        System.out.println("나이="+ myage);
        System.out.println("몸무게="+ weight);
        System.out.println("지역코드="+ loc_code);

        // System.out.println("성인인증="+ isAdult); // 초기화 안된 변수는 오류

        isAdult = true;
        System.out.println("성인인증="+ isAdult);

        // myage = 15;
        isAdult = myage >=20; // 관계식 실행후 대입
        System.out.println("성인인증="+ isAdult);

        String message;
        //자바에서 문자열 기호는 무조건 " " 큰따움표
        message = isAdult ? "성인입니다." : "미성년 입니다.";
        // 조건식 ? -> 참이면 첫째(값,수식) 실행 , 거짓이면 둘째(값,수식) 실행
        System.out.println("메세지 = " + message);
    }
}
