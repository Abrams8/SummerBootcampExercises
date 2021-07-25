package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("----------Exercise 1----------");

        int[] array = {1, 0, 0, 0, 0, 1, 0, 0};

        Solution testOne = new Solution();
        int i = testOne.solution(array);
        System.out.println("Необходимо перевернуть " + i + " монет(ы)!");

        for (int n = 0; n < array.length; n++) {
            System.out.print(array[n] + " ");
        }

        System.out.println("\n \n" + "----------Exercise 2----------");

        String text = "We test coders. Give us a try?Save time . x x! You would like to find the sentence containing the largest number of words in some given text.";
        SolutionExTwo testTwo = new SolutionExTwo();
        int longestSentence = testTwo.solution(text);
        System.out.println("Самое длинное предложение состоит из " + longestSentence + " слов(а)!");

        System.out.println("\n" + "----------Exercise 3----------");

        int num = 1234567;
        SolutionExThree testThree = new SolutionExThree();
        int numNew = testThree.solution(num);
        System.out.println(numNew);


    }
}
