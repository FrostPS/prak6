package org.example;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findMax2() {
        StatisticsService service = new StatisticsService();
        long[] incomesInBillions = {12, 5, 8, 20, 5, 15, 8, 6, 11, 11, 12};
        long expected = 20;  // Ожидаемое значение - минимальный доход
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);
    }
}
