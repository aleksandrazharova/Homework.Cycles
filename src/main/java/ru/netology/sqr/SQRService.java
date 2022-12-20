package ru.netology.sqr;

public class SQRService {

    public int calcSQR(int x, int y) {
        int count = 0;
        if (x < y) {
            for (int i = 10; i < 100; i++) {
                if ((i * i >= x) & (i * i <= y)) {
                    count++;
                }
            }
            return (count);
        }
        return -1;
    }
}