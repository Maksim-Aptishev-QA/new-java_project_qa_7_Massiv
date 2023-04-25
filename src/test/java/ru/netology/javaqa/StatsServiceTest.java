package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindBetweenEndsMin() {
        StatsService service = new StatsService();

        int[] month = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expectedMonth = 8;
        int actualMonth = service.GetMinSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void shouldFindBetweenEndsMax() {
        StatsService service = new StatsService();

        int[] month1 = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expectedMonth = 8;
        int actualMonth = service.GetMaxSales(month1);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void totalSalesTest() {
        StatsService service = new StatsService();

        int[] salesAmount = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expectedAmount = 180;
        int actualAmount = service.SalesAmount(salesAmount);
        Assertions.assertEquals(expectedAmount, actualAmount);
    }



