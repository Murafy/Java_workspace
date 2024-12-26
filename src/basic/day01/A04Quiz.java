package basic.day01;

        //환율 : 1달러 1450원

        //여행을 갑니다. 여행 경비 500000 을 환전하려고 합니다.
        //환전 금액은 얼마인가?

        //여행을 다녀와서 귀국했습니다. 경비가 12달러가 남았습니다.
        //원화로 환전합니다! 
public class A04Quiz {
    public static void main(String[] args) {
/*          정 수 타 입 
        int money = 500000;
        int rateWon = 1450;

        int dallr = wondallr(money, rateWon);
        System.out.println("Won → Dallr 환전 : " + dallr);

        int won = dallrwon(12, rateWon);
        System.out.println("Dallr → Won 환전 : " + won);
        
    } 
    //원 -> 달러 환전 메소드 
    public static int wondallr (int money , int rateWon) {
        return (money/rateWon);
    }
    //달러 -> 원 환전 메소드 
    public static int dallrwon (int x , int rateWon) {
        return (x*rateWon);
    }
    */
//          실 수 타 입 
    int money = 500000;
    int rateWon = 1450;

    float dallr = wondallr(money, rateWon);
    //메소드 호출 
    System.out.println("Won → Dallr 환전 : " + dallr);


    float won = dallrwon(12, rateWon);
    //메소드 호출
    System.out.println("Dallr → Won 환전 : " + won);
    
} 
//원 -> 달러 환전 메소드 
public static float wondallr (int money , int rateWon) {
    return ((float)money/rateWon);
}
//달러 -> 원 환전 메소드 
public static float dallrwon (int x , int rateWon) {
    return ((float)x*rateWon);
 }
}



    
