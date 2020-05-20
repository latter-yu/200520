package Sort;

import java.util.Arrays;

public class HeapSort {
    //堆排序
    //时间复杂度：O(NlogN) [比 O(N^2) 快] 空间复杂度：O(1)
    //稳定性：不稳定排序

    //排升序要建大堆；排降序要建小堆

    public static void heapSort(int[] array) {
        //1.先建立堆
        creatHeap(array);
        int heapSize = array.length;
        for (int i = 0; i < array.length; i++) {
            swap(array, 0, heapSize - 1);
            //交换堆顶元素和最后一个元素
            heapSize --;
            //删除堆中最后一个元素
            shiftDown(array, heapSize, 0);
            //重新向下调整
        }
    }
    private static void creatHeap(int[] array) {
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            shiftDown(array, array.length, i);
        }
    }
    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    private static void shiftDown(int[] array, int size, int index) {
        int parent = index;
        int child = 2 * parent + 1;
        while (child < size) {
            if (child + 1 < size && array[child + 1] > array[child]) {
                child = child + 1;
            }
            if (array[child] > array[parent]) {
                swap(array, child, parent);
            }else {
                break;
            }
            parent = child;
            child = 2 * parent + 1;
        }
    }
    public static void main(String[] args) {
        int[] array = {4, 7, 9, 1, 5, 6, 3, 8, 2};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
