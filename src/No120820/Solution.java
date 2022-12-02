package No120820;

public class Solution {
    public int solution(int age) {
        int answer = 0;
        int maxRange = 120;
        int minRange = 0;
        boolean inputValidate = age > 0 && age <= 120;
        int baseYear = 2022;

        if (inputValidate) {
            answer = baseYear - age + 1;
        }

        return answer;
    }
}
