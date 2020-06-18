package aimToOffer.test04;

/**
 * Created by yyh on 2020/6/18 上午9:33
 */
public class SolutionYh {

    public boolean Find(int target, int [][] array) {
        if ( array == null || array.length <= 0 ||
                (array.length == 1 && array[0].length <= 0)) {
            return false;
        }

        int i = 0;
        // 二维数组列的取值
        int j = array[0].length - 1;

        // 注意边界值
        while (i < array.length && j >= 0) {
            if (target == array[i][j]) {
                return true;
            } else if (target < array[i][j]) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
