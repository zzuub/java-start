package cond.ex;

public class ScoreEx7 {
    public static void main(String[] args) {
        int x = 5;

        String result = (x % 2 == 0) ? "짝수" : "홀수";
        System.out.println("x =" + x + "," + result);
    }
}
