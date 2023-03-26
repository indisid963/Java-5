package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class RestMonthServiceTest {
    @Test
    public void test() {
        RestMonthService service = new RestMonthService();

        int expected = 3;
        int actual = service.calcRestMonth(10_000, 3_000);
        Assertions.assertEquals(expected,actual);
    }
}

