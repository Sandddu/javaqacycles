
package ru.netology.javaqa.javaqacycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/money.csv")
    public void calcMonthOfRest(int expected, int income, int expenses, int threshold){

        RestService service = new RestService();

        int actual = service.calcMonth(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}