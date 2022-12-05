package No120817;

import java.util.Arrays;

public class Solution {
    public  double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }
}
