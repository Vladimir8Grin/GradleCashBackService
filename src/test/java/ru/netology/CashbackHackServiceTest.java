package ru.netology;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    @Test
    public void testRemainWithLessThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        int result = service.remain(amount);
        Assert.assertEquals(result, 500);
    }

    @Test
    public void testRemainWithExactlyBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int result = service.remain(amount);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void testRemainWithGreaterThanBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int result = service.remain(amount);
        Assert.assertEquals(result, 500);
    }
}