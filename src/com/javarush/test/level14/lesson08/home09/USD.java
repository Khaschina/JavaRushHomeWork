package com.javarush.test.level14.lesson08.home09;

/**
 * Created by 222 on 26.12.2015.
 */
public class USD extends Money
{
    public USD(double amount)
    {
        super(amount);
    }

    @Override
    public String getCurrencyName()
    {
        return "USD";
    }
}
