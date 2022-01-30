package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void testWhenUpAndLowRange() {
        SQRService service = new SQRService();
        int lowRange = 50;
        int upRange = 1000;
        int resultSQRService = 22;
        long actual = service.range(lowRange, upRange);
        assertEquals(resultSQRService, actual);
    }


    @Test
    void testWhenRangeLarger() {
        SQRService service = new SQRService();
        int lowRange = 50;
        int upRange = 5000;
        int resultSQRService = 61;
        long actual = service.range(lowRange, upRange);
        assertEquals(resultSQRService, actual);
    }


}