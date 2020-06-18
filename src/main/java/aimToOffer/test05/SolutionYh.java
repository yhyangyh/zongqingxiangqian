package aimToOffer.test05;

/**
 * Created by yyh on 2020/6/18 上午10:26
 */
public class SolutionYh {
    public String replaceSpace(StringBuffer str) {
        if (str == null || str.length() <= 0) {
            return str.toString();
        }

        int len = str.length();
        int count = 0;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }

        if (count == 0) {
            return str.toString();
        }

        int newLen = len + count * 2;
        // StringBuffer 指定长度方法，此题可考虑直接用原来的 str 来替代 str1进行操作
        StringBuffer str1 = new StringBuffer();
        str1.setLength(newLen);

        // 注意越界
        while (len > 0) {
            if (str.charAt(--len) == ' ') {
                str1.setCharAt(--newLen, '0');
                str1.setCharAt(--newLen, '2');
                str1.setCharAt(--newLen, '%');
            } else {
                // str.charAt(len)
                str1.setCharAt(--newLen, str.charAt(len));
            }
        }

        return str1.toString();
    }


    public static void main(String[] args) {
        new SolutionYh().replaceSpace(new StringBuffer("hello world"));
    }
}
