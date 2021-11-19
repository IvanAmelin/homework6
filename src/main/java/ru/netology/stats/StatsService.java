package ru.netology.stats;

public class StatsService {
    public static void main(String[] args) {
        int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(SumOfSales(numbers));
        System.out.println(MeanSales(numbers));
        System.out.println(BestMounth(numbers));
        System.out.println(worstMounth(numbers));
        System.out.println(MounthQuantityBadSales(numbers));
        System.out.println(MounthQuantityGoodSales(numbers));
    }
    public static int SumOfSales(int[] numbers) {
        int sum = 0;
        for (int number: numbers) {
            sum += number;
        }
        return sum;
    }
    public static double MeanSales(int[] numbers) {
        int mounthQuantity = 0;
        double meanMounth;
        for (int number: numbers) {
            mounthQuantity += 1;
        }
        meanMounth = SumOfSales(numbers)/mounthQuantity;
        return meanMounth;
    }
    public static int BestMounth(int[] numbers) {
        int maxMounth = numbers[0];
        int Mounth = 0;
        for (int number: numbers) {
            Mounth += 1;
            if (maxMounth < number) {
                maxMounth = number;
//                Mounth = (Arrays.asList(numbers).indexOf(number));
            }
            }
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == maxMounth) {
                Mounth = i+1;
            }
        }
        return Mounth;
    }
    public static int worstMounth(int[] numbers) {
        int minMounth = numbers[0];
        int Mounth = 0;
        for (int number: numbers) {
            if (minMounth > number) {
                minMounth = number;
            }
        }
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == minMounth) {
                Mounth = i+1;
            }
        }
        return Mounth;
    }
    public static int MounthQuantityBadSales(int[] numbers) {
        int badMounthQuantity = 0;
        for (int number: numbers) {
            if (number < MeanSales(numbers)) {
                badMounthQuantity += 1;
            }
        }
        return badMounthQuantity;
    }
    public static int MounthQuantityGoodSales(int[] numbers) {
        int GoodMounthQuantity = 0;
        for (int number: numbers) {
            if (number > MeanSales(numbers)) {
                GoodMounthQuantity += 1;
            }
        }
        return GoodMounthQuantity;
    }

}