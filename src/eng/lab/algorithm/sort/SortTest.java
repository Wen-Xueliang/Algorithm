package eng.lab.algorithm.sort;

import eng.lab.algorithm.sort.bubbleSort.BubbleSort;
import eng.lab.algorithm.sort.common.Sort;
import eng.lab.algorithm.sort.common.SortProxy;

import java.util.Random;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/9/19 22:36
 * @Description: 验证结果是否正确
 */
public class SortTest {

    public static final int DATA_NUM = 500000;

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        doSort(bubbleSort, true);
    }

    public static void doSort(Sort sort, boolean isLoop) {
        SortProxy sortProxy = new SortProxy(bubbleSort);
        if(isLoop) {
            for(int i = 10000; i < DATA_NUM; i += 10000) {
                int[] list = initData(i);
                sortProxy.sort(list);
            }
        } else {
            int[] list = {3,5,9,1,6,8};
            sortProxy.sort(list);
        }
    }

    private static int[] initData(int dataNum) {
        Random r = new Random(1);
        int[] retList = new int[dataNum];
        for(int i = 0; i < dataNum; i++) {
            retList[i] = r.nextInt(100);
        }
        return retList;
    }
}
