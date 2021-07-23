package com.company;

public class SolutionExTwo {
    public int solution(String text) {
        int longestSentence = 0;
        String[] sentence = text.split("[?!\\.]");
        for (int i = 0; i < sentence.length; i++) {
            sentence[i] = sentence[i].trim();
            String[] word = sentence[i].split("\\s");

            int sentenceLenght = word.length;

            if (sentenceLenght > longestSentence) {
                longestSentence = sentenceLenght;
            }
        }
        return longestSentence;
    }
}
