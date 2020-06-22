package aimToOffer.test11;

/**
 * Created by yyh on 2020/6/22 下午12:05
 * 思想1：借助前后两个指针；思想2：借助二分查找算法
 */
public class Solution {

    // 思想：借助前后两个指针
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        if (array.length == 1) {
            return array[0];
        }

        int i = 0;
        int j = array.length - 1;

        while (i < j && array[i] >= array[j]) {
            i++;
        }


        return array[i];
    }
}
