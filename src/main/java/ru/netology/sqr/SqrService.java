package ru.netology.sqr;

public class SqrService {
    public int sqrCalc(int lowerLimit, int upperLimit) {
        int squaresNumber = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i >= lowerLimit & i * i <= upperLimit) {
                squaresNumber++;
            }
        }
        return squaresNumber;
    }
}
