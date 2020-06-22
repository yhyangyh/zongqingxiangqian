package algorithm.sort;

/**
 * Created by yyh on 2020/6/20 下午3:23
 * 快速排序：分治思想。将一个数组分成两个子数组，将两部分独立地排序
 * 时间复杂度：平均情况 n(log(n))，最坏情况 n^2
 */
public class QuickSort {
    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int tmp = array[left];
            int i = left;
            int j = right;

            while (i < j) {
                while (i < j && array[j] >= tmp) {
                    j--;
                }
                if (i < j) {
                    array[i] = array[j];
                    i++;
                }
                while (i < j && array[i] < tmp) {
                    i++;
                }
                if (i < j) {
                    array[j] = array[i];
                    j--;
                }
            }

            array[i] = tmp;
            quickSort(array, left, i - 1);
            quickSort(array, i + 1, right);

        }

    }


    public static void main(String[] args) {
        int[] a = {8, 9, 6, 77, 10, 4, 2, 7};
        QuickSort.quickSort(a, 0, a.length-1);
        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x] + " ");
        }
    }
}
