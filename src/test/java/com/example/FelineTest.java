package com.example;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import org.junit.Assert;

public class FelineTest {

    Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void testGetFamilyReturnCat() {
        String actualFelineFamilyName = feline.getFamily();
        String expectedFelineFamilyName = "Кошачьи";
        Assert.assertEquals(expectedFelineFamilyName, actualFelineFamilyName);
    }

    @Test
    public void testFelineEatMeat() throws Exception{
        Animal animal = new Animal();
        List <String> actualFelineEatMeat = animal.getFood("Хищник");
        List <String> expectedFelineEatMeat = feline.eatMeat();
        Assert.assertEquals(expectedFelineEatMeat, actualFelineEatMeat);
    }

    @Test
    public void testGetKittensWithoutArgumentsShouldReturn1() {
        int actualArguments = feline.getKittens();
        int expectedArguments = 1;
        Assert.assertEquals(expectedArguments, actualArguments);
    }

    @Test
    public void testGetKittensWithParameterShouldReturnPassedValueAsKittens() {
        int actualParameterShouldReturn = feline.getKittens(8);
        int expectedParameterShouldReturn = 8;
        Assert.assertEquals(expectedParameterShouldReturn, actualParameterShouldReturn);
    }

}
