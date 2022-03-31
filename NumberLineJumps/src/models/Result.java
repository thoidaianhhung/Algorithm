package models;

public class Result {
    public static String kangaroo (int x1, int v1, int x2, int v2) {
        String answer;
        if (v1 > v2 && (x1 - x2) % (v2 - v1) == 0) {
            answer = "YES";
        } else {
            answer = "NO";
        }
        return answer;
    }
}
