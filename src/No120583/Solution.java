package No120583;

import java.util.Arrays;

public class Solution {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}
