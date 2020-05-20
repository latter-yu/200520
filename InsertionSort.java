package Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertSort(int[] array) {
        //直接插入排序
        //时间复杂度：O(N^2) 空间复杂度：O(1)
        //稳定性：稳定排序
        //有序区间：[0, bound) 无序区间：[bound, size);
        for (int bound = 1; bound < array.length; bound++) {
            //处理 bound 对应的元素往前插入
            int tmp = array[bound];
            //需要从后往前，找到合适的位置进行插入
            int cur = bound - 1;
            for(; cur >= 0; cur--) {
                // 如果 cur >= tmp, 则为不稳定排序
                if(array[cur] > tmp) {
                    array[cur + 1] = array[cur];
                }else {
                    break;
                }
            }
            array[cur + 1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 7, 2, 9, 4, 3, 6, 8};
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
