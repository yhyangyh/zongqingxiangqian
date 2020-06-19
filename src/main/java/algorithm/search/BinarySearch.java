package algorithm.search;

/**
 * Created by yyh on 2020/6/19 上午11:12
 * 二分查找：折半搜索。在"有序数组"中"查找某一特定元素"的搜索算法
 * 时间复杂度：折半搜索每次把搜索区域减少一半，时间复杂度为O(log n)。（n代表集合中元素的个数）
 * 空间复杂度：O(1)
 * https://juejin.im/post/5b15ff73e51d4506b113d956
 */
public class BinarySearch {

    // 循环
    public static boolean binarySearch(int[] array, int num) {
        if (array.length <= 0) {
            return false;
        }

        int low = 0;
        int high = array.length - 1;
        int mid = array.length / 2;

        while (low <= high) {
            if (array[mid] == num) {
                return true;
            } else if (array[mid] < num) {
                low = mid + 1;
                mid = (high + low) / 2;
            } else {
                high = mid - 1;
                mid = (high + low) / 2;
            }
        }

        return false;
    }

    // 递归
    public static boolean binarySearch(int array[], int low, int high, int target) {
        if (low > high)  {
            return false;
        }

        int mid = (low + high) / 2;     // 另一种计算方法：mid = low + (high – low)/2
        if (array[mid] > target) {
            return binarySearch(array, low, mid - 1, target);
        }
        if (array[mid] < target) {
            return binarySearch(array, mid + 1, high, target);
        }
        return true;
    }


    public static void main(String[] args) {
        int[] a = {1, 4, 6, 7, 9, 10};
        System.out.println(BinarySearch.binarySearch(a, 5));
    }
}
