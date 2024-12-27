package basic.day03;

public class A18CharCondition {
 
    
        
       public static void main(String[] args) {
        char test = 'c';
        boolean result;

        result = (test >='A' && test <= 'Z');
        System.out.println(result);
        //test 에 저장된 문자가 대문자?

        result = (test >='a' && test <= 'z');
        System.out.println(result);
        //test 에 저장된 문자가 소문자?

        result = (test >='A' || test <= 'Z');
        System.out.println(result);
        //test 에 저장된 문자가 영문자?

        test = '4';
        result = (test >= '0' && test <='9');
        System.out.println(result);
    }
}
