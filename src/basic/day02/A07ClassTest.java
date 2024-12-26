package basic.day02;

import basic.day01.A04Quiz;

// 다른 클래스에서 정의된 메소드 사용 하기
// 1) 같은 패키지 클래스 여부  : 다른 패키지 클래스는 import 해서 가져옴 
// 2) 메소드가 private이면 못씀 
public class A07ClassTest {
    public static void main(String[] args) {
        //클래스 이름.메소드 => static 메소드 사용 형식 
        float dollar = A04Quiz.dallrwon(100000, 1400);
        System.out.println("환전 금액 : " + dollar);

         printQuiz();
         // 자신의 클래스 메소드 호출은 메소드 이름만 사용하면됨
    } 

    private static void printQuiz(){
        System.out.println("자바 둘째날 연습 메소드");
    }
    // 자바 jdk 의클래스들 중에는 java.lang 패키지만 import 없이 사용함 (System)에 마우스 올리면 보임   
    }

