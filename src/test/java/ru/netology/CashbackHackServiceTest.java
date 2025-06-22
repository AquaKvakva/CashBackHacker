package ru.netology;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class CashbackHackServiceTest {
    private CashbackHackService service;

    @BeforeEach
    void setUp() {
        service = new CashbackHackService();
    }

    @Test
    void testTheAmountIsMinimum() {
        int amount = 1;

        int expected = 999;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testTheAmountIsNotEnough() {
        int amount = 20;

        int expected = 980;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testTheAmountGreaterThanMinimum() {
        int amount = 1999;

        int expected = 1;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);


    }


    @Test
    void testTheAmountIsSufficient2() {
        int amount = 1001;

        int expected = 999;
        int actual = service.remain(amount);

        Assertions.assertEquals(expected, actual);
    }

//    @Test
//    public void testTheAmountIsSufficient() {
//        int amount = 1000;
//        int actual = service.remain(amount);
//        int expected = 0;
//        Assertions.assertEquals(expected, actual);
//
//    }


}
