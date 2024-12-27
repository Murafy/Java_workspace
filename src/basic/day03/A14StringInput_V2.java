package basic.day03;

import java.util.Scanner;

public class A14StringInput_V2 {
    //A12 번 while 문으로 유효한 아이디 입력할때까지 반복
    public static void main(String[] args) {
            //여러개의 문자를 입력 받아 문자열을 리턴 해주는 메소드 지원
        Scanner input = new Scanner(System.in);

        boolean run = true;
        while (run) {
        System.out.println("사용자 아이디를 입력하세요.↓↓↓↓↓↓↓↓↓↓");
        String userid = input.nextLine();
        // 아이디를 입력받는 부문

        //유효한 userid : isBlank 가 아니고 길이가 5글자 이상이여한다면? 조건 두개다 True 여야 할때 or 연산 

        if(userid.isBlank() || userid.length() < 5 || !A19MyCharMethod.isAlphabet(userid.charAt(0))) { //isBlank -> 공백포함안함
            System.out.println("유효한 아이디 입력이 아닙니다.");
        }else {
            System.out.println("입력한 아이디 확인 : " + userid);
            run= false;
            break;
            //조건을 충족하는 id가 입력되면 break; 로 더이상 코드 읽지않고 끝내기
        }
        
        //계속하시겠습니다?(Y/N) ? 로 확인 입력 받고 N입력 받으면 사용종료
            System.out.println("계속하시겠습니까 ? (Y/N) : ");
            //------------------------------------------------------------------------------
            //if(userid.nextLine().toUpperCase().equals("N"))
            //if(!userid.nextLine().toUpperCase().equals("Y") Y가 아니면 나머지는 다 false
            // run=false;
            //해당방법이 한곳에 다 적을수있어서 훨씬 효율적임
            //-------------------------------------------------------------------------------
            String continueInput = input.nextLine();
            // 진행 여부를 입력받는 부문

            switch (continueInput.toUpperCase()) {
                case "Y":
                    run = true;
                    break;
                case "N":
                    run = false;
                    break;
                default:
                System.out.println("잘못된 입력입니다. Y 또는 N을 입력해 주세요.");
                run = false;  // 잘못된 입력일 경우 종료
                    break;
            } // switch end
                
            } // while end 
        input.close();

    }
    }

