package ru.netology.javaqa;
import java.util.Arrays;


public class StatsService {
    public int getMinSales(int[] sales) {
        //int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int getMaxSales(int[] sales) {
        //int[] sales = {8,15,13,15,17,20,19,20,7,14,14,18};
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i]>=sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int salesAmount(int[] sales) {
        //int[] month = {8,15,13,15,17,20,19,20,7,14,14,18};
        int totalSales = 0;
        for(int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
        }
        return totalSales ;
    }

    public int averageSalesAmountMonth(int[] sales) {
        int totalSales = salesAmount(sales);
        int averageSales = totalSales / sales.length;

        return averageSales;
    }

    public int salesBelowAverage(int[] sales) {
        int averageSales = averageSalesAmountMonth(sales);
        int countBellow = 0;
        for(int sale: sales) {
            if (sale < averageSales) {
                countBellow++;
            }
        }
        return countBellow;

    }

    public int salesAreAboveAverage(int[] sales) {
        int averageSales = averageSalesAmountMonth(sales);
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
