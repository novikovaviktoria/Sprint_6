package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    private Cat cat;

    @Mock
    Feline feline;

    @Before
    public void init() {
        cat = new Cat(feline);
    }

    @Test
    public void testGetRightCatSound() {
        String actualCatSound = cat.getSound();
        String expectedCatSound = "Мяу";
        Assert.assertEquals(expectedCatSound, actualCatSound);
    }

    @Test
    public void testGetFood() throws Exception {
        cat.getFood();
        verify(feline).eatMeat();
    }
}
