package algorithm.sort;

/**
 * Created by yyh on 2020/6/20 下午3:01
 * 选择排序：依次找到数组中剩下数字中最小的数字，放在数组的前面
 * 时间复杂度：O(n^2 / 2)
 */
public class SelectSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    array[i] = array[j];
                    array[j] = min;
                    min = array[i];
                }
            }
        }

        for (int x = 0; x < array.length; x++) {
            System.out.print(array[x] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {8, 9, 6, 77, 10, 4, 2, 7};
        SelectSort.sort(a);
    }
}
