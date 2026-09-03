package ru.netology.stats;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticServiceTest {
    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findMaxFromMidle() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 30, 6, 11, 11, 12};
        long expected = 30;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}
