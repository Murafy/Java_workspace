package basic.day01;

public class A05ForTest {
    public static void main(String[] args) {
    long result = sumNtoM (1,100);
    System.out.println("x 부터 y 까지 더한값 : " + result);
    
}
public static long sumNtoM (long x, long y) {
   long sum = 0;
    for (long i=x;i<=y;i++){
        sum += i;
    }
    return sum;
};
//메소드 sumNtoM

}
