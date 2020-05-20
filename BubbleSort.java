package Sort;

import java.util.Arrays;

public class BubbleSort {
    public static void bubbleSort(int[] array) {
        //冒泡排序：在无序区间，通过相邻数的比较，
        //将最大的数冒泡到无序区间的最后，持续这个过程，直到数组整体有序
        //时间复杂度：O(N ^ 2) 空间复杂度：O(1)
        //稳定性：稳定排序
        //升序排序为例：
        //每次找最小元素，从后往前遍历
        //每次找最大元素：从前往后遍历

        //找最大元素
        for (int bound = 0; bound < array.length; bound++) {
            //[0, bound) 已排序区间 [bound, size) 未排序区间
            for (int cur = array.length - 1; cur > bound; cur--) {
                if (array[cur - 1] > array[cur]) {
                    swap(array, cur - 1, cur);
                }
            }
        }
    }
    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static void main(String[] args) {
        int[] array = {4, 7, 9, 1, 5, 6, 3, 8, 2};
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
}