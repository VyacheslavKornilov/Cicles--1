package ru.netology.sqr;

public class SQRService {
    public int range(int lowRange, int upRange) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowRange && i * i <= upRange) {
                count = count + 1;
            }
        }
        return count;
    }
}
