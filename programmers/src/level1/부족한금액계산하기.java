package src.level1;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long totalPrice = ((long) price * (long) count) * (long) (count + 1) / 2;

        return money >= totalPrice ? 0 : totalPrice - money;
    }
}
