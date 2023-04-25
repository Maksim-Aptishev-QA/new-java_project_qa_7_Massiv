package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindBetweenEndsMin() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 9;
        int actualSales = service.GetMinSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouldFindBetweenEndsMax() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSales = 8;
        int actualSales = service.GetMaxSales(sales);

        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void totalSalesTest() {
        StatsService service = new StatsService();

        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expectedSales = 180;
        int actualSales = service.SalesAmount(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void AverageSalesAmountMonthTest() {
        StatsService service = new StatsService();

        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expectedSales = 15;
        int actualSales = service.AverageSalesAmountMonth(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void SalesBelowAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int expectedSales = 5;
        int actualSales = service.SalesBelowAverage(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void SalesAreAboveAverageTest() {
        StatsService service = new StatsService();

        int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};

        int expectedSales = 5;
        int actualSales = service.SalesAreAboveAverage(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }
    }




