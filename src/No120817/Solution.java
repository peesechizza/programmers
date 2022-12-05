package No120817;

public class Solution {
    public  double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;

        for (int data : numbers) {
            sum += data;
        }

        answer = sum / numbers.length;
        return answer;
    }
}
