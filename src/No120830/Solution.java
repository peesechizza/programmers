package No120830;

public class Solution {
    public int solution(int n, int k) {
       int lambTotalPrice = totalPrice(Menu.LAMB, n);
       int beverageTotalPrice = totalPrice(Menu.BEVERAGE, k);
       int discountPrice = discount(Menu.BEVERAGE, n);

       int totalPay = lambTotalPrice + beverageTotalPrice - discountPrice;

       return totalPay;
    }

    private int totalPrice(Menu menu, int quantity) {
        return menu.getPrice() * quantity;
    }

    private int discount(Menu menu, int lambQuantity) {
        int point = lambQuantity / 10;
        return menu.getPrice() * point;
    }
}

enum Menu {

    LAMB("양꼬치", 12000),
    BEVERAGE("음료수", 2000);

    private final String name;
    private final int price;

    Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}