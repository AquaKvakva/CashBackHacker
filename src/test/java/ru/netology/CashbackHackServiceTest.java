package ru.netology;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testTheAmountIsNotEnough() {
        int amount = 20;

        int actual = service.remain(amount);
        int expected = 980;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTheAmountGreaterThanMinimum() {
        int amount = 1999;
        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void testTheAmountIsMinimum() {
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTheAmountIsSufficient2() {
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testTheAmountIsSufficient() {
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);

    }


}
