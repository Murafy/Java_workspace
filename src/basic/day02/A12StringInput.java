package basic.day02;
import java.util.Scanner;

//문자열 입력 : Scanner 클래스의 기능 사용
public class A12StringInput {
    public static void main(String[] args) {
    //여러개의 문자를 입력 받아 문자열을 리턴 해주는 메소드 지원
        Scanner input = new Scanner(System.in);

        System.out.println("사용자 아이디를 입력하세요.↓↓↓↓↓↓↓↓↓↓");
        String userid = input.nextLine();

        //유효한 userid : isBlank 가 아니고 길이가 5글자 이상이여한다면?

        if(userid.isBlank() || userid.length() < 5){ //isBlank -> 공백포함안함
            System.out.println("유효한 아이디 입력이 아닙니다.");
        }
        // 아래 if문을 줄이면 위에 || (or) 로 바꿀수있음 

        // else if(userid.length() < 5){
        // System.out.println("유효한 아이디 입력이 아닙니다.");
        // }
        
        System.out.println("입력한 아이디 확인 : " + userid);

        input.close(); // 입력 자원 사용 종료
        
        
    }
}
