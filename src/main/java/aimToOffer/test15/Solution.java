package aimToOffer.test15;

/**
 * Created by yyh on 2020/6/23 上午10:45
 */
public class Solution {

    public static int solution(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n = n & (n-1);
        }
        return count;
    }

    public static void main(String[] args) {
    }
}
