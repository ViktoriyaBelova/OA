package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void Remain() {
        final CashbackHackService cashbackHackService = new CashbackHackService();
        final int amount = 999;

        final int actual = cashbackHackService.remain(amount);
        final int expected = 999;

        assertEquals(actual, expected);
    }
}