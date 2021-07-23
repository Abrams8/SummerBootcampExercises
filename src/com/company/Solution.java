package com.company;

public class Solution {
    public int solution(int[] array) {
        int counterHead = 0;
        int counterTail = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                counterHead++;
            } else {
                counterTail++;
            }
        }
        if (counterHead > counterTail) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 1) {
                    array[i] = 0;
                }
            }
            return counterTail;
        } else {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == 0) {
                    array[i] = 1;
                }
            }
            return counterHead;
        }
    }
}
