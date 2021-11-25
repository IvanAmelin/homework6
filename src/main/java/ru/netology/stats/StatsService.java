package ru.netology.stats;

public class StatsService {


    public static int sumOfSales(int[] numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static double meanSales(int[] numbers) {
        int mounthQuantity = 0;
        double meanMounth;
        for (int number : numbers) {
            mounthQuantity += 1;
        }
        meanMounth = sumOfSales(numbers) / mounthQuantity;
        return meanMounth;
    }

    public static int bestMounth(int[] numbers) {
        int maxMounth = numbers[0];
        int mounth = 0;
        for (int number : numbers) {
            mounth += 1;
            if (maxMounth < number) {
                maxMounth = number;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == maxMounth) {
                mounth = i + 1;
            }
        }
        return mounth;
    }

    public static int worstMounth(int[] numbers) {
        int minMounth = numbers[0];
        int mounth = 0;
        for (int number : numbers) {
            if (minMounth > number) {
                minMounth = number;
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == minMounth) {
                mounth = i + 1;
            }
        }
        return mounth;
    }

    public static int mounthQuantityBadSales(int[] numbers) {
        int badMounthQuantity = 0;
        for (int number : numbers) {
            if (number < meanSales(numbers)) {
                badMounthQuantity += 1;
            }
        }
        return badMounthQuantity;
    }

    public static int mounthQuantityGoodSales(int[] numbers) {
        int goodMounthQuantity = 0;
        for (int number : numbers) {
            if (number > meanSales(numbers)) {
                goodMounthQuantity += 1;
            }
        }
        return goodMounthQuantity;
    }

}