package aimToOffer.test03;

/**
 * Created by yyh on 2020/6/17 下午7:52
 */
public class SolutionYh {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false

    // 思路：利用数组构造"哈希表"
    public boolean duplicate(int numbers[],int length,int [] duplication) {

        if (length <= 1) {
            return false;
        }

        int[] tmp = new int[length];
        for (int i = 0; i < length; i++) {
            tmp[i] = -1;
        }

        for (int j = 0; j < length; j++) {
            if (tmp[numbers[j]] != -1) {
                duplication[0] = numbers[j];
                return true;
            }

            tmp[numbers[j]] = numbers[j];
        }

        return false;
    }
}
