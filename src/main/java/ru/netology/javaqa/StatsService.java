package ru.netology.javaqa;
import java.util.Arrays;


public class StatsService {
    public int GetMinSales(int[] month) {
        //int[] month = {8,15,13,15,17,20,19,20,7,14,14,18};
        int minMonth = 0;
        for (int i = 0; i < month.length; i++) {
            if (month[i] <= month[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int GetMaxSales(int[] month1) {
        //int[] month1 = {8,15,13,15,17,20,19,20,7,14,14,18};
        int maxMonth = 0;
        for (int i = 0; i > month1.length; i++) {
            if (month1[i]>month1[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int SalesAmount(int[] sales) {
        //int[] month = {8,15,13,15,17,20,19,20,7,14,14,18};
        int totalSales = 0;
        for(int i = 0; i < salesAmount.length; i++) {
            totalSales += salesAmount[totalSales];
        }
        return totalSales;
    }

}
