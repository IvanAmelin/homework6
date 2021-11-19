package ru.netology.stats;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    @ParameterizedTest
    @CsvSource(value = {
            "'Сумма всех продаж', '8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 180",
            })
    void StatsService_SumSales(String testName, String massive, long expected) {
        //       int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] ints = Arrays.stream(massive.split(", ")).mapToInt(Integer::valueOf).toArray();

        long actual = StatsService.SumOfSales(ints);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource(value = {
            "'Средняя сумма продаж в месяц', '8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 15",
    })
    void StatsService_MeanSales(String testName, String massive, long expected) {
        //       int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] ints = Arrays.stream(massive.split(", ")).mapToInt(Integer::valueOf).toArray();

        double actual = StatsService.MeanSales(ints);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource(value = {
            "'Номер месяца, в котором был пик продаж', '8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 8",
    })
    void StatsService_BestMounth(String testName, String massive, long expected) {
        //       int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] ints = Arrays.stream(massive.split(", ")).mapToInt(Integer::valueOf).toArray();

        long actual = StatsService.BestMounth(ints);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource(value = {
            "'Номер месяца, в котором был минимум продаж', '8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 9",
    })
    void StatsService_worstMounth(String testName, String massive, long expected) {
        //       int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] ints = Arrays.stream(massive.split(", ")).mapToInt(Integer::valueOf).toArray();

        long actual = StatsService.worstMounth(ints);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource(value = {
            "'Кол-во месяцев, в которых продажи были ниже среднего', '8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 5",
    })
    void StatsService_MounthQuantityBadSales(String testName, String massive, long expected) {
        //       int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] ints = Arrays.stream(massive.split(", ")).mapToInt(Integer::valueOf).toArray();

        long actual = StatsService.MounthQuantityBadSales(ints);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource(value = {
            "'Кол-во месяцев, в которых продажи были выше среднего', '8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18', 5",
    })
    void StatsService_MounthQuantityGoodSales(String testName, String massive, long expected) {
        //       int[] numbers = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int[] ints = Arrays.stream(massive.split(", ")).mapToInt(Integer::valueOf).toArray();

        long actual = StatsService.MounthQuantityGoodSales(ints);
        // производим проверку (сравниваем ожидаемый и фактический):
        // если true - то PAS
        // если false - то FAIL
        assertEquals(expected, actual);
    }
}
//"'Средняя сумма продаж в месяц', 1",
//        "'Номер месяца, в котором был пик продаж', 1",
//        "'Номер месяца, в котором был минимум продаж ', 1",
//        "'Кол-во месяцев, в которых продажи были ниже среднего', 1",
//        "'Кол-во месяцев, в которых продажи были выше среднего', 1",