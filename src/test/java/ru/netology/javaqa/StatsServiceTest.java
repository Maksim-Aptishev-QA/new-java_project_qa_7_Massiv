package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindBetweenEndsMin() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 9;
        int actualSales = service.getMinSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindBetweenEndsMax() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 8;
        int actualSales = service.getMaxSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void totalSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 180;
        int actualSales = service.salesAmount(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void averageSalesAmountMonthTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 15;
        int actualSales = service.averageSalesAmountMonth(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void salesBelowAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSales = 5;
        int actualSales = service.salesBelowAverage(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void salesAreAboveAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 5;
        int actualSales = service.salesAreAboveAverage(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }
}




