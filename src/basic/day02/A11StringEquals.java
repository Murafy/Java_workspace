package basic.day02;

public class A11StringEquals {
    //문자열 비교
    // 1) == 기호는 주소를 비교함
    // 2) equals 메소드는 저장된 "내용" 을 비교함 
    public static void main(String[] args) {
        //문자열의 내용이 같은지 비교
        System.out.println("3 > 0 = " + (3 > 0));
        boolean test = (3==3);
         // 경고 이유 : 리터럴 끼리 비교
        System.out.println("3==3 = " + test);
        test = (3!=3);
        System.out.println("3!=3 = " + test);

        //문자열 내용 비교에 == 사용안함 , == 은 주소 비교임
        System.out.println("문자열 주소 동등 비교 : " + ("Hello" == "Hello")); // True

        String name = "Java";
        String title = "Java";
        //자바 문자열의 내용이 같으면 메모리에 두 번 저장하지않는다. 
        //두 변수가 가지고있는 값이 같으므로 title은 name을 가르키게됨. 즉 같은 주소를 가르킴
        System.out.println("문자열 주소 동등 비교 : " + (name == title)); // 같은 주소를 가르킴으로 - True

        String lesson = new String ("Java");
        //new String 을 하면 새로운 객체로 생성됨 (메모리를 새로 할당받음)
        System.out.println("문자열 내용 동등 비교 : " + (lesson == title)); //새로운 객체를 생성한거라 주소가 다름 - false 

        //문자열의 내용 비교 메소드
        System.out.println("lesson.equals(title) : " + lesson.equals(title));
        //문자열 비교는 대부분 내용 비교임. equals 메소드 중요

        System.out.println("isEmpty : " + " ".isEmpty()); 
        //문자열에 내용이 있냐 물어보는것 스페이스바도 인식함 (공백도 카운트함) false / boolean 리턴
        System.out.println("isEmpty : " + " ".isBlank());
        //문자열 내용이 비어있는지 스페이스바는 인식안함 (공백 카운트안함) ture / boolean 리턴
        

    }
}
