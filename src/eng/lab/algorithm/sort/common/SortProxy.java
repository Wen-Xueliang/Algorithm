package eng.lab.algorithm.sort.common;

import java.util.Arrays;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/9/19 22:43
 * @Description: 代理类
 */
public class SortProxy implements Sort{
    Sort sort;

    public SortProxy(Sort sort) {
        this.sort = sort;
    }

    @Override
    public int[] sort(int[] list) {
        int length = list.length;
        long start = System.currentTimeMillis();
        int[] retList = sort.sort(list);
        long end = System.currentTimeMillis();
        System.out.println(String.format("%s\t%s", length, end-start));
        return retList;
    }

    public void sortAndPrint(int[] list) {
        int[] retList = sort.sort(list);
        System.out.println("retList:" + retList);

        Arrays.sort(list);
        System.out.println("compare result:" + Arrays.equals(retList, list));
    }
}
