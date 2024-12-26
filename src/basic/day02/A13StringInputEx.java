package basic.day02;

import java.util.Scanner;

public class A13StringInputEx {
    public static void main(String[] args) {
        
        //CLI 프로그램은 명령창에서 Text 기반으로 개발함
        // => 이때 필요한 선택 메뉴를 만드는것으로 예시 

        String menu; 
        Scanner sc = new Scanner(System.in);
        boolean run = true;

        System.out.println(":: 쇼핑몰 마이페이지 메뉴 입니다. ::");
        while (run) {
            System.out.println("1: 장바구니   2: 배송조회   3: 구매 목록   4:종료");
            System.out.print("선택하세요 >>>>>>");
            menu = sc.nextLine();
            
            switch (menu) {
                case "1":   // menu.equals("1")
                    System.out.println("장바구니 🛒");
                    break;
                case "2":   // menu.equals("2")
                    System.out.println("배송조회 🎁");
                    break;
                case "3":   // menu.equals("3")
                    System.out.println("구매목록 📃");
                    break;
                case "4":   // menu.equals("4")
                    System.out.println("종료 😉");
                    //조건식을 참고하여 종료 조건 설정을 함
                    run=false;
                    break;
            
                default:
                    System.out.println("메뉴중에 고르세요.");
                    break;
            }// switch end 

        } // while end
        sc.close();
    } // main end

} // class end 
