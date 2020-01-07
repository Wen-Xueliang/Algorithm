package eng.lab.algorithm.sort.common;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Wen-Xueliang
 * @Date: Created in 2019/9/19 22:41
 * @Description:
 */
public abstract class AbstractSort implements Sort {
    protected void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }

    protected Map<String, Integer> getMin(int[] list) {
        return
    }

    protected Map<String, Integer> getMax(int[] list) {
        return
    }

    protected Map<String, Integer> getMin(int[] list, int start, int end) {
        Map<String, Integer> retMap = new HashMap<>();
        int min = list[start];
        int minIndex = start;
        for(int i = start + 1; i < end; i++) {
            if(list[i] < min) {
                min = list[i];
                minIndex = i;
            }
        }
        retMap.put("index", minIndex);
        retMap.put("value", min);
        return retMap;
    }

    protected Map<String, Integer> getMax(int[] list, int start, int end) {
        Map<String, Integer> retMap = new HashMap<>();
        int max = list[start];
        int maxIndex = start;
        for(int i = start + 1; i < end; i++) {
            if(list[i] > max) {
                max = list[i];
                maxIndex = i;
            }
        }
        retMap.put("index", maxIndex);
        retMap.put("value", max);
        return retMap;
    }
}
