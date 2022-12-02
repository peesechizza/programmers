package No120830;

public class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int beveragePrice = 0;
        int lambPrice = 0;

        lambPrice = n * 12000;
        beveragePrice = k * 2000;

        if (n >= 10) {
            beveragePrice = (k * 2000) - ((n/10) * 2000);
        }

        return lambPrice + beveragePrice;
    }
}
