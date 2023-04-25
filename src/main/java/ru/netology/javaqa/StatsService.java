package ru.netology.javaqa;
import java.util.Arrays;


public class StatsService {
    public int GetMinSales(int[] sales) {
        //int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int GetMaxSales(int[] sales) {
        //int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i]>=sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int SalesAmount(int[] sales) {
        //int[] month = {8,15,13,15,17,20,19,20,7,14,14,18};
        int totalSales = 0;
        for(int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
        }
        return totalSales ;
    }

    public int AverageSalesAmountMonth(int[] sales) {
        int totalSales = SalesAmount(sales);
        int averageSales = totalSales / sales.length;

        return averageSales;
    }

    public int SalesBelowAverage(int[] sales) {
        int averageSales = AverageSalesAmountMonth(sales);
        int countBellow = 0;
        for(int sale: sales) {
            if (sale < averageSales) {
                countBellow++;
            }
        }
        return countBellow;

    }

    public int SalesAreAboveAverage(int[] sales) {
        int averageSales = AverageSalesAmountMonth(sales);
        int countHigher = 0;
        int i = 0;
        for(i = 0; i < sales.length; i++) {
            if(sales[i]>averageSales) {
                countHigher++;
            }
        }
        return countHigher;
    }

}
