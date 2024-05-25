package com.hippo.bpm.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
    public static void main(String[] args) {
        Integer[] ints = {2,2,1,1,1,2,2};
        Integer minValue = ints.length / 2;
        Integer maxElement = getMaxElement(ints, minValue);
        System.out.println("Max number of frequcy: "+maxElement);
    }
    
    private static Integer getMaxElement(Integer[] intsList, Integer minValue) {
        Map<Integer, Integer> intsFreq = new HashMap<>();
        for (Integer i : intsList) {
            intsFreq.put(i, intsFreq.getOrDefault(i, 0) + 1);
            // if (intsFreq.keySet().contains(i)) {
            //     intsFreq.put(i, intsFreq.get(i) + 1);
            // } else {
            //     intsFreq.put(i, 1);
            // }
        }
        for (Entry<Integer, Integer> e : intsFreq.entrySet()) {
            if (e.getValue() > minValue) {
                return e.getKey();
            }
        }
        return -1;
    }
}
