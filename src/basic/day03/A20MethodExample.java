package basic.day03;

import java.util.Scanner;

public class A20MethodExample {
// 3개의 정수값을 키보드에 입력받아 저장합니다.

// 입력받은 3개의 값을 maxOfNumbers(n1,n2,n3) 메소드 실행하여 최대값 리턴 받습니다.
public static void main(String[] args) {
    int n1,n2,n3; // 초기값 없이 변수 선언.(타입과 이름)
    Scanner sc = new Scanner(System.in);

    System.out.print("n1 입력 >>> ");
    n1 = sc.nextInt(); // 입력문자열을 정수값으로 변환하여 저장합니다.
    System.out.print("n2 입력 >>> ");
    n2 = sc.nextInt();
    System.out.print("n3 입력 >>> ");
    n3 = sc.nextInt();

    int max = maxOfNumbers(n1,n2,n3);
    System.out.println("n1,n2,n3 중 최댓값은 " + max);

    int low = minOfNumbers(n1, n2, n3);
    System.out.println("n1,n2,n3 중 최솟값은 " + low);
    
    sc.close();
} // main end

// 최대값 구하는 메소드 
public static int maxOfNumbers(int n1, int n2, int n3){
    int max;
    if (n1 > n2) {
        max = n1;
    }else {
        max = n2;
    }
    if(max < n3){
        max = n3;
    }
    return max;
}

public static int minOfNumbers(int n1, int n2, int n3){
    int low;
    if (n1 > n2){
        low = n2;
    }else{
        low = n1;
    }
    if(low > n3){
        low = n3;
    }
    return low;
}
}

// public static int maxOfNumbers(int n1, int n2, int n3){
//     int max = n1;
//     if (n2 > max) {
//         max = n2;
//     }else if(n3 > max){
//         max = n3;
//     }
//     return max;
// 해당 코드가 잘못 작성된 이유
// n2 > n1 = max n2
// n2보다 n1이 더 크다면
// 최댓값은 n2가 된다
// ---n2가 더 커버리면 n3랑 비교안하고 여기서 계산끝남---
// n3 > n1 = max n3
// n2 보다 큰 n1이 n3랑 비교해서 더크면 최댓값은 n3가 된다
// 요기까지 안옴