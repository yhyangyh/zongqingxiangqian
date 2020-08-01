/**
 * Created by yyh on 2020/7/15 下午7:53
 */
public class test {
    public static boolean isValid(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        if (left == right) {
            return false;
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        System.out.println(test.isValid("()"));
    }
}
