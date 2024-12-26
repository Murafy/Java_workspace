package basic.day02;

public class A08Prefix_Postfix {
    public static void main(String[] args) {
        //증감연산자 : ++ 또는 --
        //      ㄴ a = a+1 또는 a = a-1
        int start = 100; 
        // postfix(후치)
        System.out.println(" === postfix 연산 예시 ===");
        System.out.println(start++); //100 (Start 먼저 출력문으로 실행함으로 101 안나옴)
        System.out.println(start++);
        System.out.println(start++);
        System.out.println(start++);
        System.out.println(start++);
        // prefix(전치)
        System.out.println(" === prefix 연산 예시 ===");
        start=100;
        System.out.println(++start); //101 (++먼저 츨력문으로 실행됨으로 100이 아닌 101이 나옴)
        System.out.println(++start);
        System.out.println(++start);
        System.out.println(++start);
        System.out.println(++start);
    }
}
