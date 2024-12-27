package basic.day03;

public class A19MyCharMethod {
    public static void main(String[] args) {
        String message = "Hello World~!! Hi, Java~!!";
        int upper_count = 0;
        int lower_count = 0;
        int number_count = 0;
        int isAlphabet = 0;
        
    
        for (int i=0;i<message.length();i++){
            char temp = message.charAt(i);
            System.out.println(String.format("문자: %c 대문자 : %5s 소문자 : %5s 숫자:%5s 심볼: %5s" , temp, isUpperCase(temp),isLowerCase(temp),isNumberic(temp),isAlphabet(temp),isSymbol(temp)));
            if (isUpperCase(temp)){
                upper_count++;
            }else if(isLowerCase(temp)){
                lower_count++;
            }else if(isNumberic(temp)){
                number_count++;
            }else if(isAlphabet(temp)){
                isAlphabet++;
            }
            

        }
        System.out.println("대문자의 갯수는? " + upper_count );
        System.out.println("소문자의 갯수는? " + lower_count );
        System.out.println("숫자 갯수는? " + number_count );
        System.out.println("Alphabet 갯수는? " + isAlphabet );
    }
    //문자를 검사하는 코드가 자주 필요하여 다음과 메소드를 정의하여 사용하려고함

    //대문자 검사 메소드
    public static boolean isUpperCase(char c){
        return (c >= 'A' && c <= 'Z');
    }
    //소문자 검사 메소드
    public static boolean isLowerCase(char c){
        return (c >= 'a' && c <= 'z');
    }
    //영문자 검사 메소드
    public static boolean isAlphabet(char c){
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') ;
    }
    //숫자 검사 메소드
    public static boolean isNumberic(char c){
        return (c >= '0' && c <= '9');
    }
    //심볼 검사 메소드 , 아스키코드 기준으로 하기위해 코드값이 126보다 작은지 검사
    public static boolean isSymbol (char c){
        return !isAlphabet(c) && !isNumberic(c) && (int)c <=126;
    }
    

}
