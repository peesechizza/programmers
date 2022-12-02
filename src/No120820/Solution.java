package No120820;

import java.time.LocalDate;

public class Solution {
    public int solution(int age) {
        int answer = 0;
        int maxRange = 120;
        int minRange = 0;
        boolean inputValidate = age > 0 && age <= 120;

        LocalDate today = LocalDate.now();

        if (inputValidate) {
            answer = today.getYear() - age + 1;
        }

        return answer;
    }
}
