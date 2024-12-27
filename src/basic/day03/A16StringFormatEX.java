package basic.day03;

public class A16StringFormatEX {
public static void main(String[] args) {
    int i = 23;
    System.out.println("=== 정수 형식 %%d (int, long) 테스트 === ");
    System.out.println("12345678901234567890");
    System.out.println(String.format("%d", i));

    System.out.println(String.format("%5d", i));
    //기본 정렬위치 오른쪽 출력 자리수 5자리. 기본 정렬 위치 오른쪽. 남는 자리는 공백으로 표시
    System.out.println(String.format("%-5d", i));
    //정렬위치 왼쪽
    System.out.println(String.format("%05d", i));
    //남는 자리 0으로 표시

    double n = 123.56789;
    System.out.println("=== 실수 형식 %f (float, double) 테스트 ==== ");
    System.out.println(3.4);
    System.out.println(n);
    System.out.println("서식 문자 %f 는 소수 아래 6자리");
    System.out.println("12345678901234567890");
    System.out.println(String.format("%f",3.4)); // 3.400000 -> 소수점 이하 6자리
    System.out.println(String.format("%.4f",n)); //123.5679 -> 
    System.out.println(String.format("%15f", n)); //.을 포함 전체 자리수 
    System.out.println(String.format("%15.2f", n)); //.을 포함 전체 15 자리수 & 소수점 2자리수
    System.out.println(String.format("%015.2f", n)); //& 공백은 0으로 .을 포함 전체 15 자리수 & 소수점 2자리수
    

    System.out.println(" === 큰 정수값 log 테스트 ");
    long now = System.currentTimeMillis();
    System.out.println("12345678901234567890");
    System.out.println(now);
    System.out.println(String.format("%,20d", now));
    // 3자리 구분 기호, 를 출력. 공백 포함 자리수 20에 , 개수 포함됨 
}   

}
