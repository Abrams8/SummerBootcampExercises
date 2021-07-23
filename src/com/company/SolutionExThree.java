package com.company;

public class SolutionExThree {
    public int solution(int number) {
        String lineLenght = Integer.toString(number);
        String numberNew = "";
        int[] array=new int[lineLenght.length()];
        int[] arrayNew = new int[array.length];
        for (int i = 0; number != 0; i++) {
            array[i] = number % 10;
            number = number / 10;
        }
        int front = 0;
        int tail = array.length - 1;
        int i = 0;
        for (;front<array.length && front - tail != 1 && front != tail; front++, tail--) {
            int frontElement = array[front];
            int tailElement = array[tail];
            array[front] = tailElement;
            array[tail] = frontElement;
            arrayNew[i] = array[front];
            ++i;
            arrayNew[i] = array[tail];
            ++i;
        }
        if (array.length%2!=0) {
            arrayNew[arrayNew.length-1] = array[(array.length-1)/2];
        }


        for (int ii = 0; ii<arrayNew.length; ii++){
            numberNew = numberNew + Integer.toString(arrayNew[ii]);
        }

        int result = Integer.parseInt(numberNew);
        return result;
    }
}
