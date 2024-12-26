package basic.day02;
import java.util.Scanner;
//java.util 패키지 안에 Scanner 기능이 있음 import로 가꼬옴 
public class A05Quiz {

        
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      //사용할 Class 이름 / 객체 이름 / new Class (입력 스트림) <- 자바에서 사용자에게 입력받으려면 System.in 스트림을 사용하는듯
      //객체 input에 입력 받은 값을 저장함  
      System.out.print("X 의 값을 입력하세요 : ");
      Long X = input.nextLong();
      //Long 타입으로 변수 X 내부에 사용자에게 받은 input 값을 저장한다.
      //.nextLong()은 자용자에게 입력받은 데이터의 Type을 Long타입으로 하겠다는뜻

      System.out.print("Y의 값을 입력하세요 : ");
      Long Y = input.nextLong();

      System.out.println("입력한 X 의 값 : " + X);
      System.out.println("입력한 X 의 값 : " + Y);
      //변수 X 에는 사용자가 입력한 값이 저장되어있음
      //아래 메소드 부터 함수호출까지 인자를 받는 부분에 X,Y를 입력해줌으로써 완성
      
      input.close();
      //입력을 모두 끝맞췄음으로 입력자원 종료

      long result = sumNtoM(4,10);
      //인자가 4 , 10 정해져있음으로 사용자의 입력값을 받지않음
      System.out.println("4부터 10까지 더한값 : " + result);
  
      long sum = sumNtoM(X,Y);
      //5. 함수호출, 값을 변수 sum 에 저장 
      System.out.println("X부터 Y까지 더한값 : " + sum);
      //6. 출력
        
    }
  public static long sumNtoM(long x, long y) {
      long sum = 0;
      // 1. 더한값을 저장할 변수 sum을 0으로 초기화 
  
      for(long i=x;i<=y;i++) {
      //2. for 문을 이용하여 반복 / 사용자에게 입력받을 x,y값을 i=x,i<=y 대입  
         sum += i;}
      //3. i<=y 조건에 충족할때까지 반복 / 반복할때마다 i 증가 값을 sum에 더함            
      return sum; 
      //4. x, y 까지 더한값 리턴
    
  }
  }