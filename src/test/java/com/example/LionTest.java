package com.example;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    private final static String GENDER_MALE = "Самец";
    private final static String GENDER_FEMALE = "Самка";
    private final static String EXCEPTION_GENDER = "Мужской";
    private final static String EXCEPTION_MESSAGE = "Используйте допустимые значения пола животного - самей или самка";
    private final static int KITTENS_COUNT = 1;

    @Mock
    Feline feline;

    @Test
    public void TestGetFood() throws Exception {
        Lion lion = new Lion(GENDER_MALE, feline);
        lion.getFood();
        verify(feline).getFood(Mockito.anyString());
    }

    @Test
    public void TestDoesHasManeException() {
        try {
            new Lion(EXCEPTION_GENDER, feline);
        } catch (Exception exception) {
            Assert.assertEquals(EXCEPTION_MESSAGE, exception.getMessage());
        }
    }

    @Test
    public void TestGetOneKitten() throws Exception {
        Lion lion = new Lion(GENDER_FEMALE, feline);
        when(feline.getKittens()).thenReturn(1);
        int actualCountOfKittens = lion.getKittens(KITTENS_COUNT);
        Assert.assertEquals(KITTENS_COUNT, actualCountOfKittens);
    }
}
