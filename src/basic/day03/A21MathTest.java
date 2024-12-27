package basic.day03;

public class A21MathTest {
public static void main(String[] args) {
    int n1=23, n2=34, n3=45;

    System.out.println("Math.min(n1, n2) : " + Math.min(n1, n2));
    System.out.println("Math.max(n1, n2) : " + Math.max(n1, n2));

    System.out.println(Math.max(Math.max(n1,n2),n3));

    //실수의 반올림, 올림, 내림
    double dval = 5.64;
    System.out.println("Math.round(dval) : " + Math.round(dval));
    //반올림
    System.out.println("Math.ceil(dval) : " + Math.ceil(dval));
    //올림
    System.out.println("Math.floor(dval) : " + Math.floor(dval));
    //내림
    
    System.out.println(Character.toUpperCase('a'));
    System.out.println(Character.isLowerCase('A'));

    


}
}
