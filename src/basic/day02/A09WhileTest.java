package basic.day02;

public class A09WhileTest {
    public static void main(String[] args) {
        //반복문 : for, while 
        int start = 100;
        System.out.println("--- prefix ---");
        while(start < 105) {
            System.out.println(++start);
        }

        System.out.println("--- postfix ---");
        //start=105인 상태 
        start = 100; //초기화 시켜줌으로 실행 가능 
        while (start < 105) {
            System.out.println(start++);
        }
        System.out.println("--- While -> For ---");
        for (start=100;start<=105;start ++){
        System.out.println(start);
        }

        System.out.println("While 문으로 1 - 100 까지합");
        start = 1;
        int sum = 0;
        while(start <= 100){
        sum += start++ ; 
        System.out.println("start = : " + start + "    sum = : " + sum);
        }

        System.out.println("---------------------------------------");
        int n = 10;
        int m = 20;
        sum = 0;
        while (n<=m) {
            sum += n++;
            System.out.println("😋n= " + n + "   m=" + m  + "    최종합= "+ sum);
        }
     


    }
}
