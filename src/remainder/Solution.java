package remainder;

class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        int maxRange = 100;
        int minRange = 0;
        boolean validateRange = num1 > 0 && num1 <= 100 && num2 > 0 && num2 <= 100;

        if (validateRange) {
            answer = num1 % num2;
        }

        return answer;
    }
}