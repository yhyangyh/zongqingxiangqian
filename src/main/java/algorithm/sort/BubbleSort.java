package algorithm.sort;

/**
 * Created by yyh on 2020/6/20 下午3:23
 * 冒泡排序：核心思想是将无序表中的所有记录，通过两两比较关键字，得出升序序列或者降序序列
 */
public class BubbleSort {
    public static void sort(int[] array) {
        if (array.length <= 1) {
            return;
        }

        for (int i = 0; i < array.length - 1; i++) { // 外层循环控制排序趟数
            for (int j = 0; j < array.length - 1 - i; j++) {  // 内层循环控制每一趟排序多少次
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {8, 9, 6, 77, 10, 4, 2, 7};
        BubbleSort.sort(a);
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x] + " ");
        }
    }
}
