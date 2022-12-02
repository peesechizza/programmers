package No120829;

public class Solution {
    public int solution(int angle) {
        int answer = 0;
        boolean acuteValid = angle > 0 && angle < 90;
        boolean rightValid = angle == 90;
        boolean obtuseValid = angle > 90 && angle < 180;
        boolean straightValid =  angle == 180;

        if (acuteValid) {
            return 1;
        }
        if (rightValid) {
            return 2;
        }
        if (obtuseValid) {
            return 3;
        }
        if (straightValid) {
            return 4;
        }

        return answer;
    }

}
