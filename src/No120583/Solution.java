package No120583;

public class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;

        for (int data : array) {
            if (data == n) {
                answer++;
            }
        }
        return answer;
    }
}
